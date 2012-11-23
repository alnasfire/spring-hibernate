package com.seostella.spring.service;

import com.seostella.spring.dao.UserDAO;
import com.seostella.spring.domain.user.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author seostella.com
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Transactional
    public List<User> userList() {
        return userDAO.userList();
    }

    @Transactional
    public void removeUser(Long id) {
        userDAO.removeUser(id);
    }
    
    @Transactional
    public User retriveUser(Long id){
        return userDAO.retriveUser(id);
    }
    
    @Transactional
    public List<User> findUsersByName(String name){
    	return userDAO.findUsersByName( name );
    }
}