package com.sonede.mvc.beans;



public class Reclamation {
	

	private Long idRecla;	
	
	
	private long idUtilisateur;
	

	private long idDistrict;
	

	private int police;
	

	private int tournee;
	

	private int ordre;
	

	private String demandeur;
	

	private String adresse;
	

	private int telrec;	
	

	private String emailrec;	
	

	private String service;	
	

	private String demande;
	
	
	private String date;
	
	
	
	
	
	//*************Geetters and Setters	

	public Long getIdRecla() {
		return idRecla;
	}

	public void setIdRecla(Long idRecla) {
		this.idRecla = idRecla;
	}
	
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public long getIdDistrict() {
		return idDistrict;
	}

	public void setIdDistrict(long idDistrict) {
		this.idDistrict = idDistrict;
	}

	public int getPolice() {
		return police;
	}

	public void setPolice(int police) {
		this.police = police;
	}

	public int getTournee() {
		return tournee;
	}

	public void setTournee(int tournee) {
		this.tournee = tournee;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public String getDemandeur() {
		return demandeur;
	}

	public void setDemandeur(String demandeur) {
		this.demandeur = demandeur;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTelrec() {
		return telrec;
	}

	public void setTelrec(int telrec) {
		this.telrec = telrec;
	}

	public String getEmailrec() {
		return emailrec;
	}

	public void setEmailrec(String emailrec) {
		this.emailrec = emailrec;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getDemande() {
		return demande;
	}

	public void setDemande(String demande) {
		this.demande = demande;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	
	//*************Constructeur par defaut	
	public Reclamation() {
		super();
	}
	
	
	//*************Constructeur avec parametres
	public Reclamation(long idUtilisateur, long idDistrict, int police, int tournee, int ordre, String demandeur, String adresse,
			int telrec, String emailrec, String service, String demande, String date) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idDistrict = idDistrict;
		this.police = police;
		this.tournee = tournee;
		this.ordre = ordre;
		this.demandeur = demandeur;
		this.adresse = adresse;
		this.telrec = telrec;
		this.emailrec = emailrec;
		this.service = service;
		this.demande = demande;
		this.date = date;
	}

	
	
	//*************La methode toString
	@Override
	public String toString() {
		return "Reclamation [idRecla=" + idRecla + ", idUtilisateur=" + idUtilisateur + ", idDistrict=" + idDistrict
				+ ", police=" + police + ", tournee=" + tournee + ", ordre=" + ordre + ", demandeur=" + demandeur
				+ ", adresse=" + adresse + ", telrec=" + telrec + ", emailrec=" + emailrec + ", service=" + service
				+ ", demande=" + demande + ", date=" + date +"]";
	}


	
	

}
