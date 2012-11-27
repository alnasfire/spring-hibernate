package com.ctp.spring.dao;

import com.ctp.spring.domain.Role;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl implements RoleDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Role getRoleById(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
