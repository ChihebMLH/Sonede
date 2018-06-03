package com.sonede.mvc.dao;

import java.util.List;

import com.sonede.mvc.beans.Facture;

public interface IFactureDao {
	
	public Long saveFacture(Facture fact);
	public List<Facture> factureParId(Long idAbonne);
	public Facture getFacture(Long id);
	void updateFacture(Long idFacture);
	public void deleteFacture(Long id);
	public List<Facture> factureImpayee(Long idAbonne);
	//public Long checkLogin(String email, String mot_de_passe);
	//public List<Integer> ListeConsoEaux(Long idAbonne);

}
