package com.sonede.mvc.dao;

import java.util.List;

import com.sonede.mvc.beans.Abonne;

public interface IAbonneDao {
	
	public Abonne saveAbonne(Abonne ab);
	public List<Abonne> AbonneParId(String mc);
	public Abonne getAbonne(Long id);
	public Abonne updateAbonne(Abonne ab);
	public void deleteAbonne(Long id);

}
