package com.seostella.spring.dao;

import com.seostella.spring.domain.Country;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author seostella.com
 */
@Repository
public class CountryDAOImpl implements CountryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveCountry(Country user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @SuppressWarnings("unchecked")
	public List<Country> countryList() {
        return sessionFactory.getCurrentSession().createQuery("from Country").list();
    }

    public void removeCountry(Long id) {
    	Country country = (Country) sessionFactory.getCurrentSession().load(
    			Country.class, id);
        if (null != country) {
            sessionFactory.getCurrentSession().delete(country);
        }
    }
    
    public Country retriveCountry(Long id){
        Query q = sessionFactory.getCurrentSession().createQuery("from Country where id = :id");
        q.setLong("id", id);
        return (Country) q.uniqueResult();
    }
}