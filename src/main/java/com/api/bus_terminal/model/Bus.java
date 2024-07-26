package com.api.bus_terminal.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Getter @Setter
public class Bus {
    
    @Id
    private int licencePlate;
    private String tipe;
    private int seats;
    private double maxSpeed;

    public Bus() {
    }

    public Bus(int licencePlate, String tipe, int seats, double maxSpeed) {
        this.licencePlate = licencePlate;
        this.tipe = tipe;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
    }

}
