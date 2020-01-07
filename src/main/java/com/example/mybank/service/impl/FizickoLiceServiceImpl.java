package com.example.mybank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybank.model.FizickoLice;
import com.example.mybank.repository.FizickoLiceRepository;
import com.example.mybank.service.FizickoLiceService;


@Service
public class FizickoLiceServiceImpl  implements FizickoLiceService{

    @Autowired
    private FizickoLiceRepository repository;

    @Override
    public FizickoLice create(FizickoLice user) {
        return repository.save(user);
    }

    @Override
    public FizickoLice delete(int id) {
    	FizickoLice user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<FizickoLice> findAll() {
        return repository.findAll();
    }
    
    @Override
    public FizickoLice findById(int id) {
        return repository.findById(id);
    }
    


    @Override
    public FizickoLice update(FizickoLice user) {
        return null;
    }

	@Override
	public FizickoLice findByJMBG(long jmbg) {		
		return repository.findByJMBG(jmbg);
	}


   }