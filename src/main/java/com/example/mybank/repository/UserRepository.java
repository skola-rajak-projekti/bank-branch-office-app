package com.example.mybank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.mybank.model.Klijent;

public interface UserRepository extends Repository<Klijent, Long>{


    void delete(Klijent user);

    List<Klijent> findAll();

    Klijent findById(int id);

    Klijent save(Klijent user);
    
    @Query("SELECT t FROM Klijent t where t.jmbg = :jmbg") 
    Klijent findByJMBG(@Param("jmbg") long jmbg);
    
    
    }
