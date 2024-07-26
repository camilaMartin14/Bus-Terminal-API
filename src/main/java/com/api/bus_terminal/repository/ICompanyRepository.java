package com.api.bus_terminal.repository;

import com.api.bus_terminal.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyRepository extends JpaRepository<Company, Long>{
    
}
