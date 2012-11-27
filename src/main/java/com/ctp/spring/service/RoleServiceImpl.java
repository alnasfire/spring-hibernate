package com.ctp.spring.service;

import com.ctp.spring.dao.RoleDAO;
import com.ctp.spring.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleDAO roleDAO;

    @Override
    public Role getRoleById(int id) {
        return null;
    }
}
