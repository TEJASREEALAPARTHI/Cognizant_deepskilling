package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    @Transactional(readOnly = true)
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Country getCountry(String code) {
        return repository.findByCode(code);
    }

    @Transactional
    public void addCountry(Country country) {
        repository.save(country);
    }

    @Transactional
    public void updateCountry(Country country) {
        repository.save(country);
    }

    @Transactional
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    @Transactional(readOnly = true)
    public List<Country> searchCountries(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}
