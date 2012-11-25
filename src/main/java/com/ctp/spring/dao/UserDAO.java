package com.ctp.spring.dao;

import com.ctp.spring.domain.User;

import java.util.List;

public interface UserDAO {

    public void saveUser(User user);

    public List<User> userList();

    public void removeUser(Long id);

    public User retriveUser(Long id);

    public List<User> findUsersByName(String name);
}