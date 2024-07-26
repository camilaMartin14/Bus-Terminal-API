package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Address;
import com.api.bus_terminal.model.Bus;
import com.api.bus_terminal.model.Company;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService{

    @Override
    public List<Company> getCompanies() {

    }

    @Override
    public Company findCompany(long id) {

    }

    @Override
    public void saveCompany(Company com) {

    }

    @Override
    public void deleteCompany(long id) {

    }

    @Override
    public void editCompany(long id, String name, ArrayList<Bus> buses, Address address, LocalDate openingDate) {

    }

    @Override
    public void editCompany(Company com) {

    }
    
}
