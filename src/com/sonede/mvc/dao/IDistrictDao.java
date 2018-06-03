package com.sonede.mvc.dao;

import java.util.List;

import com.sonede.mvc.beans.District;

public interface IDistrictDao {
	
	public District getDistrict(Long idDistrict);
	public List<District> listDistrict();

}
