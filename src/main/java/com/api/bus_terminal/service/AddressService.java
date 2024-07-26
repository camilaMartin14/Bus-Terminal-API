package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Address;
import com.api.bus_terminal.model.Bus;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService{

    @Override
    public List<Address> getAddresses() {

    }

    @Override
    public Address findAddress(long id) {

    }

    @Override
    public void saveAddress(Address add) {

    }

    @Override
    public void deleteAddress(long id) {

    }

    @Override
    public void editAddress(long id, String name, ArrayList<Bus> buses, Address address, LocalDate openingDate) {

    }

    @Override
    public void editAddress(Address add) {

    }
    
}
