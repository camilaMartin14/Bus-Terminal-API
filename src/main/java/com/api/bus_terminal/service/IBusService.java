package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Bus;
import java.util.List;

public interface IBusService {
    
    public List <Bus> getBuses();
    
    public Bus findBus(int licencePlate);
    
    public void saveBus(Bus b);
    
    public void deleteBus(int licencePlate);

    public void editBus(int licencePlate,
                        String tipe,
                        int seats,
                        double maxSpeed);

    public void editVenta(Bus b); 
}
