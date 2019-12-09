package com.example.mybank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybank.model.Racun;
import com.example.mybank.repository.BankAccountRepository;
import com.example.mybank.service.BankAccountService;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountRepository repository;
	
	@Override
	public Racun update(Racun racun) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Racun findById(String id) {
		return repository.findById(id);
	}

	

	@Override
	public List<Racun> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Racun delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Racun create(Racun racun) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Racun> findClientAccountsByJMBG(long number) {		
		return repository.findClientAccountByJMBG(number);
	}

	

}
