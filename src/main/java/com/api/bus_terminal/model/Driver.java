package com.api.bus_terminal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Driver {
    
    @Id
    private long id;
    private String name;
    private String surname;
    private int dni;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHire;

    public Driver() {
    }

    public Driver(long id, String name, String surname, int dni, LocalDate dateOfBirth, LocalDate dateOfHire) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
    }
    
}
