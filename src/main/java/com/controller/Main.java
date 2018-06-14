package com.controller;

public class Main {
    public static void main(String[] args){
        Api api = new Api();


        if(args.length != 1) {
            System.out.println("Usage: listDspace | listCkan | migrate");
            return;
        } else {
            if(args[0].equals("listDspace")) {
                System.out.println("DSpace:");
                api.listDspace();
            } else if(args[0].equals("listCkan")) {
                System.out.println("CKAN:");
                api.listCkan();
            } else if(args[0].equals("migrate")) {
                System.out.println("migrating...");
                api.migrate();
            }  else {
                System.out.println("Usage: listDspace | listCkan | migrate");
                return;
            }
        }


    }
}


