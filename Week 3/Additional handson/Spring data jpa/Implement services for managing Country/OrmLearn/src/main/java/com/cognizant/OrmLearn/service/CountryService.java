package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public Country getCountry(String code) {
        return repository.findById(code).orElse(null);
    }

    public Country addCountry(Country country) {
        return repository.save(country);
    }

    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    public List<Country> searchCountry(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}