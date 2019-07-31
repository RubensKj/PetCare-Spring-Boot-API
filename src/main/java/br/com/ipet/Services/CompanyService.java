package br.com.ipet.Services;

import br.com.ipet.Models.Company;
import br.com.ipet.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public void save(Company company) {
        companyRepository.save(company);
    }

    public void remove(Company company) {
        companyRepository.delete(company);
    }

    public void removeById(long id) {
        companyRepository.deleteById(id);
    }

    public Company findById(Long longID) {
        return companyRepository.findById(longID).get();
    }

    public List<Company> findAll() { return companyRepository.findAll(); }

    public boolean existsByCnpj(String cnpj) { return companyRepository.existsByCnpj(cnpj); }
}
