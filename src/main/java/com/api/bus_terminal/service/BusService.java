package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Bus;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BusService implements IBusService {

    @Override
    public List<Bus> getBuses() {

    }

    @Override
    public Bus findBus(int licencePlate) {

    }

    @Override
    public void saveBus(Bus b) {

    }

    @Override
    public void deleteBus(int licencePlate) {

    }

    @Override
    public void editBus(int licencePlate, String tipe, int seats, double maxSpeed) {

    }

    @Override
    public void editVenta(Bus b) {

    }
    
}
