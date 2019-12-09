package com.example.mybank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Racun {
	@Id	
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id; 

	private String brojracuna;
	private String status;	
	private long pripadaklijentu;
	private String tipracuna;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBrojRacuna() {
		return brojracuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		this.brojracuna = brojRacuna;
	}
	public long getPripadaKlijentu() {
		return pripadaklijentu;
	}
	public void setPripadaKlijentu(long pripadaKlijentu) {
		this.pripadaklijentu = pripadaKlijentu;
	}
	public String getTipRacuna() {
		return tipracuna;
	}
	public void setTipRacuna(String tipRacuna) {
		this.tipracuna = tipRacuna;
	}
	

}
