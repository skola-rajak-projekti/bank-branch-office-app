package com.example.mybank.model;


public class NalogZaPrenos {
	
	private long id;
	private String duznik;
	private String poverilac;
	private String svrhaPlacanja;
	private String racunDuznika;
	private String racunPoverioca;
	private Float iznos;
	private String valuta;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDuznik() {
		return duznik;
	}
	public void setDuznik(String duznik) {
		this.duznik = duznik;
	}
	public String getPoverilac() {
		return poverilac;
	}
	public void setPoverilac(String poverilac) {
		this.poverilac = poverilac;
	}
	public String getSvrhaPlacanja() {
		return svrhaPlacanja;
	}
	public void setSvrhaPlacanja(String svrhaPlacanja) {
		this.svrhaPlacanja = svrhaPlacanja;
	}
	public String getRacunDuznika() {
		return racunDuznika;
	}
	public void setRacunDuznika(String racunDuznika) {
		this.racunDuznika = racunDuznika;
	}
	public String getRacunPoverioca() {
		return racunPoverioca;
	}
	public void setRacunPoverioca(String racunPoverioca) {
		this.racunPoverioca = racunPoverioca;
	}
	public Float getIznos() {
		return iznos;
	}
	public void setIznos(Float iznos) {
		this.iznos = iznos;
	}
	public String getValuta() {
		return valuta;
	}
	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

}
