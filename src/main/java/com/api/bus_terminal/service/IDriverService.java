package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Driver;
import java.time.LocalDate;
import java.util.List;

public interface IDriverService {
    
    public List <Driver> getDrivers();
    
    public Driver findDriver(long id);
    
    public void saveDriver(Driver dri);
    
    public void deleteDriver(long id);

    public void editDriver(long id,
                            String name,
                            String surname,
                            int dni,
                            LocalDate dateOfBirth,
                            LocalDate dateOfHire);

    public void editDriver(Driver dri); 
}
