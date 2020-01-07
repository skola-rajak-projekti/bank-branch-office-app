package com.example.mybank.service;

import java.util.List;

import com.example.mybank.model.FizickoLice;

public interface FizickoLiceService {

	public FizickoLice update(FizickoLice user);

	FizickoLice findById(int id);

	FizickoLice findByJMBG(long jmbg);

	List<FizickoLice> findAll();

	FizickoLice delete(int id);

	FizickoLice create(FizickoLice user);

}
