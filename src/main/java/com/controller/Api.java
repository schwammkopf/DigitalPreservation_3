package com.controller;

import com.dto.ckan.Dataset;
import com.dto.ckan.Organization;
import com.dto.ckan.Resource;
import com.dto.ckan.Response;
import com.dto.dspace.Bitstream;
import com.dto.dspace.Collection;
import com.dto.dspace.Community;
import com.dto.dspace.Item;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Api {

    final String REST_DSPACE_URI;
    final String REST_CKAN_URI;
    final String AUTHORIZATION_KEY;



    public Api() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/main/resources/config"));
        } catch(IOException e){
            e.printStackTrace();
        }

        REST_DSPACE_URI = prop.getProperty("dspace");
        REST_CKAN_URI = prop.getProperty("ckan");
        AUTHORIZATION_KEY = prop.getProperty("key");



    }

    public void listDspace(){

        Client client = javax.ws.rs.client.ClientBuilder.newClient();

        Community[] communities = client.target(REST_DSPACE_URI+"communities").request(MediaType.APPLICATION_JSON).get(Community[].class);
        Collection[] collections = client.target(REST_DSPACE_URI+"collections").request(MediaType.APPLICATION_JSON).get(Collection[].class);
        Item[] items = client.target(REST_DSPACE_URI+"items").request(MediaType.APPLICATION_JSON).get(Item[].class);
        Bitstream[] bitstreams = client.target(REST_DSPACE_URI+"bitstreams").request(MediaType.APPLICATION_JSON).get(Bitstream[].class);


        for(int i = 0; i < communities.length; i++)
            System.out.println(communities[i].toString());

        for(int i = 0; i < collections.length; i++)
            System.out.println(collections[i].toString());

        for(int i = 0; i < bitstreams.length; i++)
            System.out.println(bitstreams[i].toString());

        for(int i = 0; i < items.length; i++)
            System.out.println(items[i].toString());


    }

    public void listCkan(){

        Client client = javax.ws.rs.client.ClientBuilder.newClient();

        Response response = client.target(REST_CKAN_URI+"package_search").request(MediaType.APPLICATION_JSON).get(Response.class);
        System.out.println(response.toString());

    }

    public void migrate(){

        Client client = javax.ws.rs.client.ClientBuilder.newClient();
        Community[] communities = client.target(REST_DSPACE_URI+"communities").request(MediaType.APPLICATION_JSON).get(Community[].class);
        Collection[] collections = client.target(REST_DSPACE_URI+"collections").request(MediaType.APPLICATION_JSON).get(Collection[].class);
        Item[] items = client.target(REST_DSPACE_URI+"items").request(MediaType.APPLICATION_JSON).get(Item[].class);
        //Bitstream[] bitstreams = client.target(REST_DSPACE_URI+"bitstreams").request(MediaType.APPLICATION_JSON).get(Bitstream[].class);


        //javax.ws.rs.core.Response response = client.target(REST_CKAN_URI+"organization_create").request(MediaType.APPLICATION_JSON).header("Authorization", AUTHORIZATION_KEY).post(Entity.entity(communityToOrganization(communities[0]), MediaType.APPLICATION_JSON));
        //System.out.println(response.getStatusInfo().toString());


        System.out.println("Migrating communities...");
        for (Community community: communities
             ) {
            javax.ws.rs.core.Response response = client.target(REST_CKAN_URI+"organization_create").request(MediaType.APPLICATION_JSON).header("Authorization", AUTHORIZATION_KEY).post(Entity.entity(communityToOrganization(community), MediaType.APPLICATION_JSON));
            System.out.println(response.getStatusInfo().toString());
        }

        System.out.println("Migrating collections...");
        for (Collection collection: collections
                ) {
            javax.ws.rs.core.Response response = client.target(REST_CKAN_URI+"package_create")
                    .request(MediaType.APPLICATION_JSON).header("Authorization", AUTHORIZATION_KEY).post(Entity.entity(collectionToDataset(collection), MediaType.APPLICATION_JSON));
            System.out.println(response.getStatusInfo().toString());
        }

        System.out.println("Migrating items...");
        for (Item item: items
                ) {
            javax.ws.rs.core.Response response = client.target(REST_CKAN_URI+"resource_create")
                    .request(MediaType.APPLICATION_JSON).header("Authorization", AUTHORIZATION_KEY).post(Entity.entity(itemToResource(item), MediaType.APPLICATION_JSON));
            System.out.println(response.getStatusInfo().toString());
        }




    }

    private Organization communityToOrganization(Community community){
        Organization organization = new Organization();
        organization.setId(community.getId());
        organization.setName(community.getName());
        organization.setType(community.getType());
        organization.setDescription(organization.getDescription());

        return organization;
    }

    private Dataset collectionToDataset(Collection collection){
        Dataset dataset = new Dataset();
        dataset.setId(collection.getId());
        dataset.setType(collection.getType());
        dataset.setName(collection.getName());
        dataset.setUrl(collection.getLink());
        dataset.setNumResources(collection.getNumberItems());

        return dataset;
    }

    private Resource itemToResource(Item item){
        Resource resource = new Resource();
        resource.setId(item.getId());
        resource.setName(item.getName());

        return resource;
    }




}
