package com.api.bus_terminal.repository;

import com.api.bus_terminal.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, Long>{
    
}
