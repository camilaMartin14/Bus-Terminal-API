package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Address;
import com.api.bus_terminal.model.Bus;
import com.api.bus_terminal.model.Company;
import com.api.bus_terminal.repository.ICompanyRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService{
    
    @Autowired
    private ICompanyRepository comRepo;

    @Override
    public List<Company> getCompanies() {
        List <Company> listCompanies= comRepo.findAll();
        return listCompanies;
    }

    @Override
    public Company findCompany(long id) {
        Company com = comRepo.findById(id).orElse(null);
        return com;
    }

    @Override
    public void saveCompany(Company com) {

    }

    @Override
    public void deleteCompany(long id) {

    }

    @Override
    public void editCompany(Company com) {

    }

    @Override
    public void editCompany(long id, String name, ArrayList<Bus> buses, Address address) {

    }
    
}
