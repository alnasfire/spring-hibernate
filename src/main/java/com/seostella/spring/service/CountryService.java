package com.seostella.spring.service;

import java.util.List;

import com.seostella.spring.domain.Country;

/**
 * 
 * @author seostella.com
 */
public interface CountryService {

    public void saveCountry(Country user);

    public List<Country> countryList();

    public void removeCountry(Long id);

    public Country retriveCountry(Long id);
}