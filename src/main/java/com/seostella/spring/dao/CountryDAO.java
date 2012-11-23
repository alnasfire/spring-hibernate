package com.seostella.spring.dao;

import com.seostella.spring.domain.Country;
import java.util.List;

/**
 * 
 * @author seostella.com
 */
public interface CountryDAO {

    public void saveCountry(Country user);

    public List<Country> countryList();

    public void removeCountry(Long id);

    public Country retriveCountry(Long id);
}