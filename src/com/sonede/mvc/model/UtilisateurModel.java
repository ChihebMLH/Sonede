package com.sonede.mvc.model;

import java.util.ArrayList;
import java.util.List;

import com.sonede.mvc.beans.Utilisateur;



public class UtilisateurModel {
	private String motCle;
	private List<Utilisateur> users = new ArrayList<Utilisateur>();
	
	
	//*************Getters and Setters (Du Model)
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Utilisateur> getUtilisateurs() {
		return users;
	}
	public void setUtilisateurs(List<Utilisateur> users) {
		this.users = users;
	}
	

}
