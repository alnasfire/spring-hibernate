package com.seostella.spring.dao;

import com.seostella.spring.domain.user.User;
import java.util.List;

/**
 * 
 * @author seostella.com
 */
public interface UserDAO {

    public void saveUser(User user);

    public List<User> userList();

    public void removeUser(Long id);

    public User retriveUser(Long id);
    
    public List<User> findUsersByName(String name);
}