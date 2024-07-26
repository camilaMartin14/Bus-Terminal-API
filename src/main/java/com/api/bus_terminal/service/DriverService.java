package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Driver;
import com.api.bus_terminal.repository.IDriverRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService implements IDriverService{
    
    @Autowired
    private IDriverRepository driRepo;

    @Override
    public List<Driver> getDrivers() {
        List <Driver> listDrivers = driRepo.findAll();
        return listDrivers;
    }

    @Override
    public Driver findDriver(long id) {
        Driver dri = driRepo.findById(id).orElse(null);
        return dri;
    }

    @Override
    public void saveDriver(Driver dri) {

    }

    @Override
    public void deleteDriver(long id) {

    }

    @Override
    public void editDriver(long id, String name, String surname, int dni, LocalDate dateOfBirth, LocalDate dateOfHire) {

    }

    @Override
    public void editDriver(Driver dri) {

    }
    
}
