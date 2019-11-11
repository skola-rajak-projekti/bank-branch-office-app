package com.example.mybank.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.mybank.model.User;

public interface UserRepository extends Repository<User, Long>{


    void delete(User user);

    List<User> findAll();

    User findById(int id);

    User save(User user);
    }
