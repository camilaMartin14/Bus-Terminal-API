package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Bus;
import com.api.bus_terminal.repository.IBusRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusService implements IBusService {
    
    @Autowired
    private IBusRepository busRepo;

    @Override
    public List<Bus> getBuses() {
        List <Bus> listBuses = busRepo.findAll();
        return listBuses;
    }

    @Override
    public Bus findBus(long id) {
        Bus b = busRepo.findById(id).orElse(null);
        return b;
    }

    @Override
    public void saveBus(Bus b) {

    }

    @Override
    public void deleteBus(long id) {

    }

    @Override
    public void editBus(long id, String tipe, int seats, double maxSpeed) {

    }

    @Override
    public void editVenta(Bus b) {

    }
    
}
