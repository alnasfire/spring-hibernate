package com.ctp.spring.dao;

import com.ctp.spring.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @SuppressWarnings("unchecked")
	public List<User> userList() {
        return null;
    }

    public void removeUser(Long id) {
        User user = (User) sessionFactory.getCurrentSession().load(
                User.class, id);
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }
    }

    @Override
    public User retriveUser(Long id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<User> findUsersByName(String name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}