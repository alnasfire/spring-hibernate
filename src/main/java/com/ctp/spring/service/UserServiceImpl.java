package com.ctp.spring.service;

import com.ctp.spring.dao.UserDAOImpl;
import com.ctp.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAOImpl userDAOImpl;

    @Transactional
    public void saveUser(User user) {
        userDAOImpl.saveUser(user);
    }

//    @Transactional
//    public List<User> userList() {
//        return userDAOImpl.userList();
//    }
//
//    @Transactional
//    public void removeUser(Long id) {
//        userDAOImpl.removeUser(id);
//    }
//
//    @Transactional
//    public User retriveUser(Long id){
//        return userDAOImpl.retriveUser(id);
//    }
//
//    @Transactional
//    public List<User> findUsersByName(String name){
//    	return userDAOImpl.findUsersByName( name );
//    }

    public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
        this.userDAOImpl = userDAOImpl;
    }

    public UserDAOImpl getUserDAOImpl() {
        return userDAOImpl;
    }
}