package com.sonede.mvc.beans;

public class District {
	
	private Long idDistrict;
	
	private String libelleDis;
	
	private int telDis;

	
	
	//*************Getters and Setters
	public Long getIdDistrict() {
		return idDistrict;
	}

	public void setIdDistrict(Long idDistrict) {
		this.idDistrict = idDistrict;
	}

	public String getLibelleDis() {
		return libelleDis;
	}

	public void setLibelleDis(String libelleDis) {
		this.libelleDis = libelleDis;
	}

	public int getTelDis() {
		return telDis;
	}

	public void setTelDis(int telDis) {
		this.telDis = telDis;
	}

	
	//*************Constructeur par defaut	
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//*************Constructeur avec parametres
	public District(String libelleDis, int telDis) {
		super();
		this.libelleDis = libelleDis;
		this.telDis = telDis;
	}

	
	//*************La methode toString
	@Override
	public String toString() {
		return "District [idDistrict=" + idDistrict + ", libelleDis=" + libelleDis + ", telDis=" + telDis + "]";
	}
	
	

}
