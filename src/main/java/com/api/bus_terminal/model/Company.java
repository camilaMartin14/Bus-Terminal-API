package com.api.bus_terminal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Company {
    
    @Id
    private int id;
    private String name;
    private ArrayList <Bus> buses;
    private Address address;
    private LocalDate openingDate;

    public Company() {
    }

    public Company(int id, String name, ArrayList<Bus> buses, Address address, LocalDate openingDate) {
        this.id = id;
        this.name = name;
        this.buses = buses;
        this.address = address;
        this.openingDate = openingDate;
    }
    
}
