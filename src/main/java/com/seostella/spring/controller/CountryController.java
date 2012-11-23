package com.seostella.spring.controller;

import com.seostella.spring.domain.Country;
import com.seostella.spring.service.CountryService;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author seostella.com
 */
@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country/index")
    public String listContacts(Map<String, Object> map) {

        map.put("country", new Country());
        map.put("countryList", countryService.countryList());

        return "country_list";
    }

    @RequestMapping(value = "/country/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("country") Country country, BindingResult result) {

        countryService.saveCountry(country);

        return "redirect:/country/index";
    }

    @RequestMapping("/country/delete/{countryId}")
    public String deleteContact(@PathVariable("countryId") Long countryId) {

        countryService.removeCountry(countryId);

        return "redirect:/country/index";
    }
    
    @RequestMapping("/country/save")
    public String saveContact(@ModelAttribute("country") Country country, BindingResult result) {

        countryService.saveCountry(country);

        return "redirect:/country/edit/" + country.getId();
    }
    
    @RequestMapping("/country/edit/{countryId}")
    public String editContact(@PathVariable("countryId") Long countryId, Map<String, Object> map) {

        Country country = countryService.retriveCountry(countryId);
        map.put("country", country); 

        return "country_edit";
    }
    
}