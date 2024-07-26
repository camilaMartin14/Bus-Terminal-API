package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Address;
import com.api.bus_terminal.model.Bus;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface IAddressService {
        
    public List <Address> getAddresses();
    
    public Address findAddress(long id);
    
    public void saveAddress(Address add);
    
    public void deleteAddress(long id);

    public void editAddress(long id,
                            String name,
                            ArrayList <Bus> buses,
                            Address address,
                            LocalDate openingDate);

    public void editAddress(Address add); 
}
