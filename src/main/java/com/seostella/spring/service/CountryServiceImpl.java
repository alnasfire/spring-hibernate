package com.seostella.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seostella.spring.dao.CountryDAO;
import com.seostella.spring.domain.Country;

/**
 * 
 * @author seostella.com
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAO countryDAO;

    @Transactional
    public void saveCountry(Country country) {
        countryDAO.saveCountry(country);
    }

    @Transactional
    public List<Country> countryList() {
        return countryDAO.countryList();
    }

    @Transactional
    public void removeCountry(Long id) {
        countryDAO.removeCountry(id);
    }
    
    @Transactional
	public Country retriveCountry(Long id) {
		return countryDAO.retriveCountry(id);
	}
}