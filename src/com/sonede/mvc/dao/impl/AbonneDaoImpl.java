package com.sonede.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.sonede.mvc.SingletonConnection;
import com.sonede.mvc.beans.Abonne;
import com.sonede.mvc.dao.IAbonneDao;

public class AbonneDaoImpl implements IAbonneDao {

	@Override
	public Abonne saveAbonne(Abonne ab) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps1 = connection.prepareStatement("INSERT INTO abonne (nom,prenom,adresse,cin,tel) VALUES (?,?,?,?,?)");
			ps1.setString(1, ab.getNom());
			ps1.setString(2, ab.getPrenom());
			ps1.setString(3, ab.getAdresse());
			ps1.setInt(4, ab.getCin());
			ps1.setInt(5, ab.getTel());
			ps1.executeUpdate();
				PreparedStatement ps2 = connection.prepareStatement("SELECT MAX(idAbonne) AS MAX_ID FROM abonne");
				ResultSet rs = ps2.executeQuery();
				if(rs.next()){
					ab.setIdAbonne(rs.getLong("MAX_ID"));
				}
			
			ps1.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ab;		
	}

	@Override
	public List<Abonne> AbonneParId(String mc) {
		List<Abonne> abonnes = new ArrayList<Abonne>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM abonne WHERE nom LIKE ?");
			ps.setString(1, mc);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Abonne ab = new Abonne();
				ab.setIdAbonne(rs.getLong("idAbonne"));
				ab.setNom(rs.getString("nom"));
				ab.setPrenom(rs.getString("prenom"));
				ab.setAdresse(rs.getString("adresse"));
				ab.setCin(rs.getInt("cin"));
				ab.setTel(rs.getInt("tel"));
				abonnes.add(ab);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return abonnes;
	}

	@Override
	public Abonne getAbonne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Abonne updateAbonne(Abonne ab) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAbonne(Long id) {
		// TODO Auto-generated method stub
		
	}

}
