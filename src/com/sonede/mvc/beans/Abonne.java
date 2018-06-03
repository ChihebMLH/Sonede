package com.sonede.mvc.beans;

import java.io.Serializable;


public class Abonne {
	

	private Long idAbonne;	
	

	private String nom ;
	

	private String prenom;
	

	private String adresse;	
	

	private int cin;	
	

	private int tel;	
	/*private String email;		a effacer
	private String motdepasse;	a effacer*/
	
	
	
	
	
	
	

	//*************Getters and Setters
	public Long getIdAbonne() {
		return idAbonne;
	}

	public void setIdAbonne(Long idAbonne) {
		this.idAbonne = idAbonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	/*public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}*/



	//*************Constructeur par defaut	
	public Abonne() {
		super();
	}


	//*************Constructeur avec parametres
	public Abonne(String nom, String prenom, String adresse, int cin, int tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cin = cin;
		this.tel = tel;
	/*	this.email = email;
		this.motdepasse = motdepasse;      */
	}


	
	//*************La methode toString
	@Override
	public String toString() {
		return "Abonne [idAbonne=" + idAbonne + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", cin=" + cin + ", tel=" + tel + "]";
	}
	

}
