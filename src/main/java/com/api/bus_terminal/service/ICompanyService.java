package com.api.bus_terminal.service;

import com.api.bus_terminal.model.Company;
import java.util.List;

public interface ICompanyService {
    
    public List <Company> getCompanies();
    
    public Company findCompany(long id);
    
    public void saveCompany(Company com);
    
    public void deleteCompany(long id);

    public void editCompany(long id,
                            String country,
                            String city,
                            String street,
                            int number,
                            String neighborhood,
                            int postalCode);

    public void editCompany(Company com); 
}
