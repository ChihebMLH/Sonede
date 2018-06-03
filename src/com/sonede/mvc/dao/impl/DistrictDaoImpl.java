package com.sonede.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sonede.mvc.SingletonConnection;
import com.sonede.mvc.beans.Abonne;
import com.sonede.mvc.beans.District;
import com.sonede.mvc.dao.IDistrictDao;

public class DistrictDaoImpl implements IDistrictDao{

	@Override
	public District getDistrict(Long idDistrict) {
		District dist = null;
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM district WHERE idDistrict=?");
			ps1.setLong(1, idDistrict);
			ResultSet rs = ps1.executeQuery();
			if(rs.next()){
				dist= new District();
				dist.setIdDistrict(idDistrict);
				dist.setLibelleDis(rs.getString("libelleDis"));
				dist.setTelDis(rs.getInt("telDis"));				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dist;
	}
	
	
	
	@Override
	public List<District> listDistrict() {
		List<District> districts = new ArrayList<District>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM district");			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				District dist = new District();
				dist.setIdDistrict(rs.getLong("idDistrict"));
				dist.setLibelleDis(rs.getString("libelleDis"));
				dist.setTelDis(rs.getInt("telDis"));
				
				districts.add(dist);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return districts;
	}


}
