package com.example.mybank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybank.model.Racun;
import com.example.mybank.service.BankAccountService;

@RestController
@RequestMapping({"/api/account"})
public class BankAccountController {

	@Autowired
	private BankAccountService accountService;

    @PostMapping
    public Racun create(@RequestBody Racun user){
        return accountService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public List<Racun> findByJMBG(@PathVariable("id") long id){
        return accountService.findClientAccountsByJMBG(id);
    }

    @PutMapping
    public Racun update(@RequestBody Racun racun){
        return accountService.update(racun);
    }

    @DeleteMapping(path ={"{id}"})
    public Racun delete(@PathVariable("id") int id) {
        return accountService.delete(id);
    }

    @GetMapping(path = {"all"})
    public List<Racun> findAll(){
        return accountService.findAll();
    }

	
	
}
