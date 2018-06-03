package com.sonede.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sonede.mvc.SingletonConnection;
import com.sonede.mvc.beans.District;
import com.sonede.mvc.beans.Trimestre;
import com.sonede.mvc.dao.ITrimestreDao;

public class TrimestreDaoImpl implements ITrimestreDao{

	@Override
	public List<Trimestre> listTrimestre() {
		List<Trimestre> trimestre = new ArrayList<Trimestre>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM trimestre");			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Trimestre trim = new Trimestre();
				trim.setIdtrimestre(rs.getLong("idtrimestre"));
				trim.setMoisTrim(rs.getString("moisTrim"));
				
				trimestre.add(trim);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return trimestre;
	}

}
