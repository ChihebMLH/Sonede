package com.sonede.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonede.mvc.SingletonConnection;
import com.sonede.mvc.beans.Abonne;
import com.sonede.mvc.beans.Utilisateur;
import com.sonede.mvc.dao.IUtilisateurDao;

public class UtilisateurDaoImpl implements IUtilisateurDao {

	@Override
	public Long saveUtilisateur(Utilisateur user) {
		Connection connection = SingletonConnection.getConnection();
		Long idUser = null;
		try {
			PreparedStatement ps1 = connection.prepareStatement("INSERT INTO utilisateur (nom,prenom,adresse,cin,tel,email,motdepasse,idDistrict) VALUES (?,?,?,?,?,?,?,?)");
			ps1.setString(1, user.getNom());
			ps1.setString(2, user.getPrenom());
			ps1.setString(3, user.getAdresse());
			ps1.setInt(4, user.getCin());
			ps1.setInt(5, user.getTel());
			ps1.setString(6, user.getEmail());
			ps1.setString(7, user.getMotdepasse());
			ps1.setLong(8, user.getIdDistrict());
			ps1.executeUpdate();
				PreparedStatement ps2 = connection.prepareStatement("SELECT MAX(idUtilisateur) AS MAX_ID FROM utilisateur");
				ResultSet rs = ps2.executeQuery();
				if(rs.next()){
					idUser = rs.getLong("MAX_ID");
				}
			
			ps1.close();
			ps2.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idUser;		
	}

	@Override
	public List<Utilisateur> utilisateurParDistrict(String mc) {
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM utilisateur WHERE nom LIKE ?");
			ps1.setString(1, mc);
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				Utilisateur user = new Utilisateur();
				user.setIdUtilisateur(rs.getLong("idUtilisateur"));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setCin(rs.getInt("cin"));
				user.setAdresse(rs.getString("adresse"));
				user.setTel(rs.getInt("tel"));
				user.setEmail(rs.getString("email"));
				user.setMotdepasse(rs.getString("motdepasse"));
				user.setIdDistrict(rs.getLong("idDistrict"));
				
				users.add(user);				
			}
			ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return users;
	}

	@Override
	public Utilisateur getUtilisateur(Long id) {
		Utilisateur user = null;
		Connection connection = SingletonConnection.getConnection();
		
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM utilisateur WHERE idUtilisateur=?");
			ps1.setLong(1, id);
			ResultSet rs = ps1.executeQuery();
			if (rs.next()) {
				user = new Utilisateur();
				user.setIdUtilisateur(rs.getLong("idUtilisateur"));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setCin(rs.getInt("cin"));
				user.setAdresse(rs.getString("adresse"));
				user.setTel(rs.getInt("tel"));
				user.setEmail(rs.getString("email"));
				user.setMotdepasse(rs.getString("motdepasse"));
				user.setIdDistrict(rs.getLong("idDistrict"));
			}
			ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur user) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps1 = connection.prepareStatement("UPDATE utilisateur SET nom=?,prenom=?,adresse=?,cin=?,tel=?,email=?,motdepasse=?,idDistrict=? WHERE idUtilisateur=?");
			ps1.setString(1, user.getNom());
			ps1.setString(2, user.getPrenom());
			ps1.setString(3, user.getAdresse());
			ps1.setInt(4, user.getCin());
			ps1.setInt(5, user.getTel());
			ps1.setString(6, user.getEmail());
			ps1.setString(7, user.getMotdepasse());
			ps1.setLong(8, user.getIdDistrict());
			ps1.setLong(9, user.getIdUtilisateur());
			
			ps1.executeUpdate();				
			ps1.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void deleteUtilisateur(Long id) {
		Connection connection = SingletonConnection.getConnection();		
		try {
			PreparedStatement ps1 = connection.prepareStatement("DELETE FROM utilisateur WHERE idUtilisateur=?");
			ps1.setLong(1, id);			
			ps1.executeUpdate();				
			ps1.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean checkCin(int cin) {		
		Connection connection = SingletonConnection.getConnection();
		boolean result = false;
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT cin FROM utilisateur WHERE cin=? ");
			ps1.setInt(1, cin);
			
			ResultSet rs = ps1.executeQuery();
			if(rs.next())
			{
				result = true;
			}
				ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
	

	
	
	@Override
	public boolean checkEmail(String email) {		
		Connection connection = SingletonConnection.getConnection();
		boolean result = false;
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT email FROM utilisateur WHERE email=? ");
			ps1.setString(1, email);
			
			ResultSet rs = ps1.executeQuery();
			if(rs.next())
			{
				result = true;
			}
				ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
		
	

	@Override
	public Long checkLogin(String email, String mot_de_passe) {		
		Connection connection = SingletonConnection.getConnection();
		Long id = null;
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT idUtilisateur AS ID FROM utilisateur WHERE email=? AND motdepasse=?");
			ps1.setString(1, email);
			ps1.setString(2, mot_de_passe);
			ResultSet rs = ps1.executeQuery();
			if(rs.next())
			{
				id = rs.getLong("ID");
			}
				ps1.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return id;
	}
	
	public Abonne checkAbonnne(Long idUtilisateur) {		
		Connection connection = SingletonConnection.getConnection();	
		int cin = 0;
		Abonne abonne = null;
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT cin AS cinUt FROM utilisateur WHERE idutilisateur=?");
			ps1.setLong(1, idUtilisateur);
			ResultSet rs = ps1.executeQuery();
			if(rs.next()){
				cin = rs.getInt("cinUt");
			}
			ps1.close();
			
			PreparedStatement ps2 = connection.prepareStatement("SELECT * FROM abonne WHERE cin=?");
			ps2.setInt(1, cin);			
			ResultSet rs2 = ps2.executeQuery();
			
			if(rs2.next())
			{			
				abonne= new Abonne();				
				abonne.setIdAbonne(rs2.getLong("idAbonne"));
				abonne.setNom(rs2.getString("nom"));
				abonne.setPrenom(rs2.getString("prenom"));
				abonne.setAdresse(rs2.getString("adresse"));
				abonne.setCin(rs2.getInt("cin"));
				abonne.setTel(rs2.getInt("tel"));
			}			
			ps2.close();
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return abonne;
	}

}
