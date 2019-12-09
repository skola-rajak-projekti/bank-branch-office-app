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

import com.example.mybank.model.Klijent;
import com.example.mybank.service.UserService;

@RestController
@RequestMapping({"/api/client"})
public class UserController {

    @Autowired
    private UserService userService;
    

    @PostMapping
    public Klijent create(@RequestBody Klijent user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public Klijent findOne(@PathVariable("id") long id){
        return userService.findByJMBG(id);
    }

    @PutMapping
    public Klijent update(@RequestBody Klijent user){
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public Klijent delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @GetMapping(path = {"/all"})
    public List<Klijent> findAll(){
        return userService.findAll();
    }

}
