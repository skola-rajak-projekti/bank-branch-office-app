package com.example.mybank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.mybank.model.FizickoLice;

public interface FizickoLiceRepository extends Repository<FizickoLice, Long>{


    void delete(FizickoLice user);

    List<FizickoLice> findAll();

    FizickoLice findById(int id);

    FizickoLice save(FizickoLice user);
    
    @Query("SELECT t FROM FizickoLice t where t.jmbg = :jmbg") 
    FizickoLice findByJMBG(@Param("jmbg") long jmbg);
    
    
    }
