package com.example.mybank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybank.model.FizickoLice;
import com.example.mybank.service.FizickoLiceService;

@RestController
@RequestMapping({"/api/client"})
public class FizickoLiceController {

    @Autowired
    private FizickoLiceService service;
    

    @PostMapping
    public FizickoLice create(@RequestBody FizickoLice user){
        return service.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public FizickoLice findOne(@PathVariable("id") long id){
        return service.findByJMBG(id);
    }

    @PutMapping
    public FizickoLice update(@RequestBody FizickoLice user){
        return service.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public FizickoLice delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
    
	@CrossOrigin(origins = "http://localhost:4200")	
    @GetMapping(path = {"/all"})
    public List<FizickoLice> findAll(){
        return service.findAll();
    }

}
