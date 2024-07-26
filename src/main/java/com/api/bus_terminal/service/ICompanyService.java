package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Address;
import com.api.bus_terminal.model.Bus;
import com.api.bus_terminal.model.Company;
import java.util.ArrayList;
import java.util.List;

public interface ICompanyService {
    
    public List <Company> getCompanies();
    
    public Company findCompany(long id);
    
    public void saveCompany(Company com);
    
    public void deleteCompany(long id);

    public void editCompany(long id,
                            String name,
                            ArrayList <Bus> buses,
                            Address address);

    public void editCompany(Company com); 
}
