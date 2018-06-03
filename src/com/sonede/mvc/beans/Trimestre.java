package com.sonede.mvc.beans;

public class Trimestre {
	
	private Long idtrimestre;
	
	private String moisTrim;

	
	//*************Getters and Setters
	public Long getIdtrimestre() {
		return idtrimestre;
	}

	public Trimestre(String moisTrim) {
		super();
		this.moisTrim = moisTrim;
	}
	
	
	
	//*************Constructeur par defaut	
	public Trimestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	//*************Constructeur avec parametres
	public void setIdtrimestre(Long idtrimestre) {
		this.idtrimestre = idtrimestre;
	}

	public String getMoisTrim() {
		return moisTrim;
	}

	public void setMoisTrim(String moisTrim) {
		this.moisTrim = moisTrim;
	}
	
	

	//*************La methode toString
	@Override
	public String toString() {
		return "Trimestre [idtrimestre=" + idtrimestre + ", moisTrim=" + moisTrim + "]";
	}

}
