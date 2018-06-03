package com.sonede.mvc.beans;



public class Utilisateur {
	
	

	private Long idUtilisateur;	
	

	private String nom ;
	

	private String prenom;
	

	private String adresse;	
	

	private int cin;	
	

	private int tel;	
	

	private String email;
	

	private String motdepasse;
	
	private Long idDistrict;
	
	
	
	//*************Getters and Setters
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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
	public String getEmail() {
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
	}
	public Long getIdDistrict() {
		return idDistrict;
	}
	public void setIdDistrict(Long idDistrict) {
		this.idDistrict = idDistrict;
	}
	
	
	
	
	
	
	//*************Constructeur par defaut
	public Utilisateur() {
		super();
	}
	
	
	
	//*************Constructeur avec parametres
	public Utilisateur(String nom, String prenom, String adresse, int cin, int tel, String email, String motdepasse, Long idDistrict) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cin = cin;
		this.tel = tel;
		this.email = email;
		this.motdepasse = motdepasse;
		this.idDistrict = idDistrict;
	}
	
	
	
	//*************La methode toString
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", cin=" + cin + ", tel=" + tel + ", email=" + email + ", motdepasse=" + motdepasse + ", idDistrict=" + idDistrict + "]";
	}
	
	
	

}
