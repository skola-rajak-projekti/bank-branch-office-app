package com.example.mybank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.mybank.model.Racun;

public interface BankAccountRepository extends Repository<Racun, String>{


    void delete(Racun racun);

    List<Racun> findAll();

    //Racun findById(int id);

    Racun save(Racun user);
    
    @Query("SELECT t FROM Racun t where t.brojracuna = :brojracuna") 
    Racun findById(@Param("brojracuna") String brojracuna);
    

    @Query("SELECT t FROM Racun t where t.pripadaklijentu = :jmbg")
    List<Racun> findClientAccountByJMBG(@Param("jmbg") long jmbg);
    
}

	
