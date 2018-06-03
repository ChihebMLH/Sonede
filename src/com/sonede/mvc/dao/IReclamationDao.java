package com.sonede.mvc.dao;

import java.util.List;

import com.sonede.mvc.beans.Reclamation;

public interface IReclamationDao {
	
	public void saveReclamation(Reclamation recla);
	public List<Reclamation> reclamationParId(Long idUtilisateur);
	public Reclamation getReclamation(Long id);
	public Reclamation updateReclamation(Reclamation recla);
	public void deleteReclamation(Long id);

}
