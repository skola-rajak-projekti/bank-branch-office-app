package com.example.mybank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybank.model.Klijent;
import com.example.mybank.repository.UserRepository;
import com.example.mybank.service.UserService;


@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public Klijent create(Klijent user) {
        return repository.save(user);
    }

    @Override
    public Klijent delete(int id) {
        Klijent user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<Klijent> findAll() {
        return repository.findAll();
    }
    
    @Override
    public Klijent findById(int id) {
        return repository.findById(id);
    }
    


    @Override
    public Klijent update(Klijent user) {
        return null;
    }

	@Override
	public Klijent findByJMBG(long jmbg) {		
		return repository.findByJMBG(jmbg);
	}


   }