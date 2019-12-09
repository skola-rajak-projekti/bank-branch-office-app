package com.example.mybank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Klijent {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id; 

	private long jmbg;
    private String ime;
    private String prezime;    

	private String adresa;
    private String telefon;
    private String email;

    public Klijent(String firstName, String lastName) {
        this.ime = firstName;
        this.prezime = lastName;
    }

   
  
    public long getJMBG() {
  		return jmbg;
  	}

  	public void setJMBG(long jMBG) {
  		jmbg = jMBG;
  	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

    protected Klijent() {}


	public int getId() {
		return id;
	}

}