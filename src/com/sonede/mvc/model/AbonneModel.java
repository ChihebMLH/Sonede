package com.sonede.mvc.model;

import java.util.ArrayList;
import java.util.List;

import com.sonede.mvc.beans.Abonne;

public class AbonneModel {
	private String motCle;
	private List<Abonne> abonnes = new ArrayList<Abonne>();
	
	
	//*************Getters and Setters (Du Model)
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Abonne> getAbonnes() {
		return abonnes;
	}
	public void setAbonnes(List<Abonne> abonnes) {
		this.abonnes = abonnes;
	}
	
}
