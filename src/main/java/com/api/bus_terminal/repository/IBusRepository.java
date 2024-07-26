package com.api.bus_terminal.repository;

import com.api.bus_terminal.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBusRepository extends JpaRepository<Bus, Long>{
    
}
