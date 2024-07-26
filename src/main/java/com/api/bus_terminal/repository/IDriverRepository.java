package com.api.bus_terminal.repository;

import com.api.bus_terminal.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDriverRepository extends JpaRepository<Driver, Long>{
    
}
