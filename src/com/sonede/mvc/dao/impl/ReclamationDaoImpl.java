package com.sonede.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonede.mvc.SingletonConnection;
import com.sonede.mvc.beans.Facture;
import com.sonede.mvc.beans.Reclamation;
import com.sonede.mvc.dao.IReclamationDao;

public class ReclamationDaoImpl implements IReclamationDao {

	@Override
	public void saveReclamation(Reclamation recla) {
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps1 = connection.prepareStatement("INSERT INTO reclamation (idUtilisateur,adresse,demande,demandeur,idDistrict,emailrec,ordre,police,service,telrec,tournee,date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
			ps1.setLong(1, recla.getIdUtilisateur());
			ps1.setString(2, recla.getAdresse());
			ps1.setString(3, recla.getDemande());
			ps1.setString(4, recla.getDemandeur());
			ps1.setLong(5, recla.getIdDistrict());
			ps1.setString(6, recla.getEmailrec());
			ps1.setInt(7, recla.getOrdre());
			ps1.setInt(8, recla.getPolice());
			ps1.setString(9, recla.getService());
			ps1.setInt(10, recla.getTelrec());
			ps1.setInt(11, recla.getTournee());
			ps1.setString(12, recla.getDate());
			ps1.executeUpdate();
			
			ps1.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Reclamation> reclamationParId(Long idUtilisateur) {
		List<Reclamation> reclas = new ArrayList<Reclamation>();
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM reclamation WHERE idUtilisateur=? ORDER BY idRecla DESC");
			ps1.setLong(1, idUtilisateur);
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				Reclamation recla = new Reclamation();
				recla.setIdRecla(rs.getLong("idRecla"));
				recla.setIdUtilisateur(rs.getLong("idUtilisateur"));
				recla.setAdresse(rs.getString("adresse"));
				recla.setDemande(rs.getString("demande"));
				recla.setDemandeur(rs.getString("demandeur"));
				recla.setIdDistrict(rs.getLong("idDistrict"));
				recla.setEmailrec(rs.getString("emailrec"));
				recla.setOrdre(rs.getInt("ordre"));
				recla.setPolice(rs.getInt("police"));
				recla.setService(rs.getString("service"));
				recla.setTelrec(rs.getInt("telrec"));
				recla.setTournee(rs.getInt("tournee"));
				recla.setDate(rs.getString("date"));
				
				reclas.add(recla);			
			}
			
			ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return reclas;
	}
	
	
	

	@Override
	public Reclamation getReclamation(Long idRecla) {
		Reclamation recla = null;
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM reclamation WHERE idRecla =?");
			ps1.setLong(1, idRecla);
			ResultSet rs = ps1.executeQuery();
			if (rs.next()) {
				recla = new Reclamation();
				recla.setIdRecla(rs.getLong("idRecla"));
				recla.setIdUtilisateur(rs.getLong("idUtilisateur"));
				recla.setAdresse(rs.getString("adresse"));
				recla.setDemande(rs.getString("demande"));
				recla.setDemandeur(rs.getString("demandeur"));
				recla.setIdDistrict(rs.getLong("idDistrict"));
				recla.setEmailrec(rs.getString("emailrec"));
				recla.setOrdre(rs.getInt("ordre"));
				recla.setPolice(rs.getInt("police"));
				recla.setService(rs.getString("service"));
				recla.setTelrec(rs.getInt("telrec"));
				recla.setTournee(rs.getInt("tournee"));
				recla.setDate(rs.getString("date"));		
			}
			
			ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return recla;
	}
	
	

	@Override
	public Reclamation updateReclamation(Reclamation recla) {
			Connection connection = SingletonConnection.getConnection();
			
			try {
				PreparedStatement ps1 = connection.prepareStatement("UPDATE reclamation SET idUtilisateur=?,adresse=?,demande=?,demandeur=?,idDistrict=?,emailrec=?,ordre=?,police=?,service=?,telrec=?,tournee=?, date=? WHERE idRecla=?");
				ps1.setLong(1, recla.getIdUtilisateur());
				ps1.setString(2, recla.getAdresse());
				ps1.setString(3, recla.getDemande());
				ps1.setString(4, recla.getDemandeur());
				ps1.setLong(5, recla.getIdDistrict());
				ps1.setString(6, recla.getEmailrec());
				ps1.setInt(7, recla.getOrdre());
				ps1.setInt(8, recla.getPolice());
				ps1.setString(9, recla.getService());
				ps1.setInt(10, recla.getTelrec());
				ps1.setInt(11, recla.getTournee());
				ps1.setString(12, recla.getDate());
				ps1.setLong(13, recla.getIdRecla());
				
				
				ps1.executeUpdate();				
				ps1.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		return recla;
	}
	
	
	

	@Override
	public void deleteReclamation(Long idRecla) {
		Connection connection = SingletonConnection.getConnection();		
		try {
			PreparedStatement ps1 = connection.prepareStatement("DELETE FROM reclamation WHERE idRecla=?");
			ps1.setLong(1, idRecla);			
			ps1.executeUpdate();				
			ps1.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
