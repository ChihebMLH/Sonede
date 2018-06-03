package com.sonede.mvc.dao;

import java.util.List;

import com.sonede.mvc.beans.Abonne;
import com.sonede.mvc.beans.Utilisateur;

public interface IUtilisateurDao {
	
	
	public Long saveUtilisateur(Utilisateur user);
	public List<Utilisateur> utilisateurParDistrict(String mc);
	public Utilisateur getUtilisateur(Long id);
	public Utilisateur updateUtilisateur(Utilisateur user);
	public void deleteUtilisateur(Long id);
	public boolean checkCin(int cin);
	public boolean checkEmail(String email);
	public Long checkLogin(String email, String mot_de_passe);
	public Abonne checkAbonnne(Long idUtilisateur);

}
