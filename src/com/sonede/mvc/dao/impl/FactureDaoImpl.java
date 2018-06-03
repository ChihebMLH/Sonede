package com.sonede.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonede.mvc.SingletonConnection;
import com.sonede.mvc.beans.Facture;
import com.sonede.mvc.dao.IFactureDao;

public class FactureDaoImpl implements IFactureDao {

	@Override
	public Long saveFacture(Facture fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facture> factureParId(Long idAbonne) {
		List<Facture> facts = new ArrayList<Facture>();
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM facture WHERE idAbonne =?");
			ps1.setLong(1, idAbonne);
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				Facture fact = new Facture();
				fact.setIdFacture(rs.getLong("idFacture"));
				fact.setIdDistrict(rs.getLong("idDistrict"));
				fact.setIdAbonne(rs.getLong("idAbonne"));
				fact.setCodeBranchement(rs.getInt("codeBranchement"));
				fact.setTournee(rs.getInt("tournee"));
				fact.setOrdre(rs.getInt("ordre"));
				fact.setNouv_index(rs.getInt("nouv_index"));
				fact.setAnc_index(rs.getInt("anc_index"));
				fact.setConsommation(rs.getInt("consommation"));
				fact.setFraisConso(rs.getFloat("fraisConso"));
				fact.setTotConso1(rs.getFloat("totConso1"));
				fact.setFraisFixesConso(rs.getFloat("fraisFixesConso"));
				fact.setTotConso2(rs.getFloat("totConso2"));
				fact.setAddTotConso(rs.getFloat("addTotConso"));
				fact.setPourcentage(rs.getInt("pourcentage"));
				fact.setAnterieurFrais(rs.getFloat("anterieurFrais"));
				fact.setTotal_Conso(rs.getFloat("total_Conso"));
				fact.setConsoAssainissement1(rs.getInt("consoAssainissement1"));
				fact.setConsoAssainissement2(rs.getInt("consoAssainissement2"));
				fact.setFraisAssainissement1(rs.getFloat("fraisAssainissement1"));
				fact.setFraisAssainissement2(rs.getFloat("fraisAssainissement2"));
				fact.setTotAssai1(rs.getFloat("totAssai1"));
				fact.setTotAssai2(rs.getFloat("totAssai2"));
				fact.setFraisFixesAssai(rs.getFloat("fraisFixesAssai"));
				fact.setTotal_Assai(rs.getFloat("total_Assai"));
				fact.setMontant_total(rs.getFloat("montant_total"));
				fact.setImpaye(rs.getBoolean("impaye"));
				fact.setDatelimite(rs.getString("datelimite"));
				fact.setAnnee(rs.getInt("annee"));
				fact.setIdtrimestre(rs.getLong("idtrimestre"));		
				
				facts.add(fact);
				
			}
			
			ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return facts;
	}
	
	
	
	
	@Override
	public List<Facture> factureImpayee(Long idAbonne) {
		List<Facture> facts = new ArrayList<Facture>();
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM facture WHERE idAbonne =? AND impaye=?");
			ps1.setLong(1, idAbonne);
			ps1.setBoolean(2, true);
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				Facture fact = new Facture();
				fact.setIdFacture(rs.getLong("idFacture"));
				fact.setIdDistrict(rs.getLong("idDistrict"));
				fact.setIdAbonne(rs.getLong("idAbonne"));
				fact.setCodeBranchement(rs.getInt("codeBranchement"));
				fact.setTournee(rs.getInt("tournee"));
				fact.setOrdre(rs.getInt("ordre"));
				fact.setNouv_index(rs.getInt("nouv_index"));
				fact.setAnc_index(rs.getInt("anc_index"));
				fact.setConsommation(rs.getInt("consommation"));
				fact.setFraisConso(rs.getFloat("fraisConso"));
				fact.setTotConso1(rs.getFloat("totConso1"));
				fact.setFraisFixesConso(rs.getFloat("fraisFixesConso"));
				fact.setTotConso2(rs.getFloat("totConso2"));
				fact.setAddTotConso(rs.getFloat("addTotConso"));
				fact.setPourcentage(rs.getInt("pourcentage"));
				fact.setAnterieurFrais(rs.getFloat("anterieurFrais"));
				fact.setTotal_Conso(rs.getFloat("total_Conso"));
				fact.setConsoAssainissement1(rs.getInt("consoAssainissement1"));
				fact.setConsoAssainissement2(rs.getInt("consoAssainissement2"));
				fact.setFraisAssainissement1(rs.getFloat("fraisAssainissement1"));
				fact.setFraisAssainissement2(rs.getFloat("fraisAssainissement2"));
				fact.setTotAssai1(rs.getFloat("totAssai1"));
				fact.setTotAssai2(rs.getFloat("totAssai2"));
				fact.setFraisFixesAssai(rs.getFloat("fraisFixesAssai"));
				fact.setTotal_Assai(rs.getFloat("total_Assai"));
				fact.setMontant_total(rs.getFloat("montant_total"));
				fact.setImpaye(rs.getBoolean("impaye"));
				fact.setDatelimite(rs.getString("datelimite"));
				fact.setAnnee(rs.getInt("annee"));
				fact.setIdtrimestre(rs.getLong("idtrimestre"));		
				
				facts.add(fact);
				
			}
			
			ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return facts;
	}
	

	@Override
	public Facture getFacture(Long idFacture) {
		Connection connection = SingletonConnection.getConnection();
		Facture fact = null;
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM facture WHERE idFacture=?");
			ps1.setLong(1, idFacture);
			ResultSet rs = ps1.executeQuery();
			
			if(rs.next()) {
				fact = new Facture();
				fact.setIdFacture(rs.getLong("idFacture"));
				fact.setIdDistrict(rs.getLong("idDistrict"));
				fact.setIdAbonne(rs.getLong("idAbonne"));
				fact.setCodeBranchement(rs.getInt("codeBranchement"));
				fact.setTournee(rs.getInt("tournee"));
				fact.setOrdre(rs.getInt("ordre"));
				fact.setNouv_index(rs.getInt("nouv_index"));
				fact.setAnc_index(rs.getInt("anc_index"));
				fact.setConsommation(rs.getInt("consommation"));
				fact.setFraisConso(rs.getFloat("fraisConso"));
				fact.setTotConso1(rs.getFloat("totConso1"));
				fact.setFraisFixesConso(rs.getFloat("fraisFixesConso"));
				fact.setTotConso2(rs.getFloat("totConso2"));
				fact.setAddTotConso(rs.getFloat("addTotConso"));
				fact.setPourcentage(rs.getInt("pourcentage"));
				fact.setAnterieurFrais(rs.getFloat("anterieurFrais"));
				fact.setTotal_Conso(rs.getFloat("total_Conso"));
				fact.setConsoAssainissement1(rs.getInt("consoAssainissement1"));
				fact.setConsoAssainissement2(rs.getInt("consoAssainissement2"));
				fact.setFraisAssainissement1(rs.getFloat("fraisAssainissement1"));
				fact.setFraisAssainissement2(rs.getFloat("fraisAssainissement2"));
				fact.setTotAssai1(rs.getFloat("totAssai1"));
				fact.setTotAssai2(rs.getFloat("totAssai2"));
				fact.setFraisFixesAssai(rs.getFloat("fraisFixesAssai"));
				fact.setTotal_Assai(rs.getFloat("total_Assai"));
				fact.setMontant_total(rs.getFloat("montant_total"));
				fact.setImpaye(rs.getBoolean("impaye"));
				fact.setDatelimite(rs.getString("datelimite"));
				fact.setAnnee(rs.getInt("annee"));
				fact.setIdtrimestre(rs.getLong("idtrimestre"));			
			}
			
			ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return fact;
	}
	
	

	@Override
	public void updateFacture(Long idFacture) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps1 = connection.prepareStatement("UPDATE facture SET impaye=0 WHERE idFacture=?");
			ps1.setLong(1, idFacture);
			
			ps1.executeUpdate();				
			ps1.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteFacture(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
/*
	@Override
	public List<Integer> ListeConsoEaux(Long idAbonne) {
		List<Integer> consos = new ArrayList<Integer>();
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT consommation FROM facture WHERE idAbonne =?");
			ps1.setLong(1, idAbonne);			
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				
				int conso = rs.getInt("consommation");
				
				consos.add(conso);
				
			}
			
			ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return consos;
	}

*/
	
	
}
