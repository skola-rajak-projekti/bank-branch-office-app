package com.example.mybank.service;

import java.util.List;

import com.example.mybank.model.Racun;

public interface BankAccountService {

	public Racun update(Racun racun) ;
	Racun findById(String id);
	//vraca racuna od klijenta za njegov jmbg
	List<Racun> findClientAccountsByJMBG(long number);
	List<Racun> findAll();
	Racun delete(int id);
	Racun create(Racun racun);
}
