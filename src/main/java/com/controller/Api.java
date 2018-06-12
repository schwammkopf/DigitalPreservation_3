package com.controller;

import com.dto.dspace.Bitstream;
import com.dto.dspace.Collection;
import com.dto.dspace.Community;
import com.dto.dspace.Item;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;

public class Api {


    private final String REST_URI = "https://demo.dspacedirect.org/rest/";

    public void listDspace(){
        Client client = javax.ws.rs.client.ClientBuilder.newClient();

        Community[] communities = client.target(REST_URI+"communities").request(MediaType.APPLICATION_JSON).get(Community[].class);
        Collection[] collections = client.target(REST_URI+"collections").request(MediaType.APPLICATION_JSON).get(Collection[].class);
        Item[] items = client.target(REST_URI+"items").request(MediaType.APPLICATION_JSON).get(Item[].class);
        Bitstream[] bitstreams = client.target(REST_URI+"bitstreams").request(MediaType.APPLICATION_JSON).get(Bitstream[].class);


        for(int i = 0; i < communities.length; i++)
            System.out.println(communities[i].toString());

        for(int i = 0; i < collections.length; i++)
            System.out.println(collections[i].toString());

        for(int i = 0; i < bitstreams.length; i++)
            System.out.println(bitstreams[i].toString());

        for(int i = 0; i < items.length; i++)
            System.out.println(items[i].toString());


    }

}
