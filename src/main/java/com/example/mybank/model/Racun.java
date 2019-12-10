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
	private double stanje;
	private double rezervisanasredstva;
	private double raspolozivasredstva;
	private String valuta;
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
	public String getBrojracuna() {
		return brojracuna;
	}
	public void setBrojracuna(String brojracuna) {
		this.brojracuna = brojracuna;
	}
	public long getPripadaklijentu() {
		return pripadaklijentu;
	}
	public void setPripadaklijentu(long pripadaklijentu) {
		this.pripadaklijentu = pripadaklijentu;
	}
	public String getTipracuna() {
		return tipracuna;
	}
	public void setTipracuna(String tipracuna) {
		this.tipracuna = tipracuna;
	}
	public double getStanje() {
		return stanje;
	}
	public void setStanje(double stanje) {
		this.stanje = stanje;
	}
	public double getRezervisanaSredstva() {
		return rezervisanasredstva;
	}
	public void setRezervisanaSredstva(double rezervisanaSredstva) {
		this.rezervisanasredstva = rezervisanaSredstva;
	}
	public double getRaspolozivaSredstva() {
		return raspolozivasredstva;
	}
	public void setRaspolozivaSredstva(double raspolozivaSredstva) {
		this.raspolozivasredstva = raspolozivaSredstva;
	}
	public String getValuta() {
		return valuta;
	}
	public void setValuta(String valuta) {
		this.valuta = valuta;
	}
	

}
