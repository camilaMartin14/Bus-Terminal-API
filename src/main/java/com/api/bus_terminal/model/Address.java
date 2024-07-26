package com.api.bus_terminal.model;

import jakarta.persistence.Id;

public class Address {
    
    @Id
    private long id;
    private String country;
    private String city;
    private String street;
    private int number;
    private String neighborhood;
    private int postalCode;

    public Address() {
    }

    public Address(long id, String country, String city, String street, int number, String neighborhood, int postalCode) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.postalCode = postalCode;
    }
    
}
