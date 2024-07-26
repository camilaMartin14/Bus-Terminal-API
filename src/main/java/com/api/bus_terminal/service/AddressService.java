package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Address;
import com.api.bus_terminal.repository.IAddressRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService{
    
    @Autowired
    private IAddressRepository addRepo;

    @Override
    public List<Address> getAddresses() {
        List <Address> listAddresses = addRepo.findAll();
        return listAddresses;
    }

    @Override
    public Address findAddress(long id) {
        Address add= addRepo.findById(id).orElse(null);
        return add;
    }

    @Override
    public void saveAddress(Address add) {

    }

    @Override
    public void deleteAddress(long id) {

    }

    @Override
    public void editAddress(Address add) {

    }

    @Override
    public void editAddress(long id, String country, String city, String street, int number, String neighborhood, int postalCode) {

    }
    
}
