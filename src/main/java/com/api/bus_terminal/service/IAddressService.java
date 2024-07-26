package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Address;
import java.util.List;

public interface IAddressService {
        
    public List <Address> getAddresses();
    
    public Address findAddress(long id);
    
    public void saveAddress(Address add);
    
    public void deleteAddress(long id);

    public void editAddress(long id,
                            String country,
                            String city,
                            String street,
                            int number,
                            String neighborhood,
                            int postalCode);

    public void editAddress(Address add); 
}
