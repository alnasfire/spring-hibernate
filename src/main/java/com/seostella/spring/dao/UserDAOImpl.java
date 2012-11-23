package com.seostella.spring.dao;

import com.seostella.spring.domain.Country;
import com.seostella.spring.domain.user.User;
import com.seostella.spring.service.CountryService;

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
public class UserDAOImpl implements UserDAO {
	@Autowired
	CountryService countryService;

    @Autowired
    private SessionFactory sessionFactory;

    public void saveUser(User user) {
    	Country country = countryService.retriveCountry( user.getCountry().getId() );
    	user.setCountry(country);
    	
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @SuppressWarnings("unchecked")
	public List<User> userList() {
        return sessionFactory.getCurrentSession().getNamedQuery( User.NamedQuery.USER_FIND_ALL ).list();
    }

    public void removeUser(Long id) {
        User user = (User) sessionFactory.getCurrentSession().load(
                User.class, id);
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }
    }
    
    public User retriveUser(Long id){
        Query q = sessionFactory.getCurrentSession().getNamedQuery( User.NamedQuery.USER_FIND_BY_ID );
        q.setLong("id", id);
        return (User) q.uniqueResult();
    }

    @SuppressWarnings("unchecked")
	public List<User> findUsersByName(String name){
        Query q = sessionFactory.getCurrentSession().getNamedQuery( User.NamedQuery.USER_FIND_BY_NAME );
        q.setString("name", "%" + name + "%");
        return (List<User>) q.list();
    }
}