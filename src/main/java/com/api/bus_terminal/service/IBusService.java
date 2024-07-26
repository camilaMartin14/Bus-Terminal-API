package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Bus;
import java.util.List;

public interface IBusService {
    
    public List <Bus> getBuses();
    
    public Bus findBus(long id);
    
    public void saveBus(Bus b);
    
    public void deleteBus(long id);

    public void editBus(long id,
                        String tipe,
                        int seats,
                        double maxSpeed);

    public void editVenta(Bus b); 
}
