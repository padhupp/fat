package com.uipurpose.detailsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.uipurpose.detailsapp.Configurations","com.uipurpose.detailsapp.controllers","com.uipurpose.detailsapp.entities","com.uipurpose.detailsapp.repositories","com.uipurpose.detailsapp.services"})
public class DetailsappApplication {

    public static void main(String[] args) {
        SpringApplication.run(DetailsappApplication.class, args);
    }

}

