package com.example.mybank.service.impl;

import java.util.List;

import com.example.mybank.model.User;

public interface UserService {
	
    
    public User update(User user) ;
	User findById(int id);
	List<User> findAll();
	User delete(int id);
	User create(User user);
 
}
