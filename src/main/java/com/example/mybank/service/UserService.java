package com.example.mybank.service;

import java.util.List;

import com.example.mybank.model.Klijent;

public interface UserService {
	
    
    public Klijent update(Klijent user) ;
	Klijent findById(int id);
	
	Klijent findByJMBG(long jmbg);
	
	List<Klijent> findAll();
	Klijent delete(int id);
	Klijent create(Klijent user);
 
}
