package com.ctp.spring.service;

import com.ctp.spring.domain.User;

import java.util.List;

public interface UserService {

	public void saveUser(User user);

	public List<User> userList();

	public void removeUser(Long id);

	public User retriveUser(Long id);

	public List<User> findUsersByName(String name);
}