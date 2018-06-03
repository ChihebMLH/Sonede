package com.sonede.mvc.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sonede.mvc.beans.District;
import com.sonede.mvc.beans.Reclamation;
import com.sonede.mvc.beans.Utilisateur;
import com.sonede.mvc.dao.IDistrictDao;
import com.sonede.mvc.dao.IReclamationDao;
import com.sonede.mvc.dao.impl.DistrictDaoImpl;
import com.sonede.mvc.dao.impl.ReclamationDaoImpl;

public class ControleurHReclamationServlet extends HttpServlet {
	
	private IReclamationDao metier;
	private IDistrictDao metierDis;
	
	
	@Override
	public void init() throws ServletException {
		metier = new ReclamationDaoImpl();
		metierDis = new DistrictDaoImpl();
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		Utilisateur user = (Utilisateur) session.getAttribute("user");	
		long idUtilisateur = user.getIdUtilisateur();
		
		List<Reclamation> reclas = metier.reclamationParId(idUtilisateur);
		if (!reclas.isEmpty() ){
			request.setAttribute("reclas", reclas);
			List<District> dists = metierDis.listDistrict();
			request.setAttribute("dists", dists);
		}else{
			request.setAttribute("message", "Vous n'avez aucune reclamation");
		}
		
		
		//Probléme a regler des libelles des districts pour chaques reclamations 
		//(la seul solution que j'ai trouvé c'est d'utiliser sql et java dans la JSP)
		/*for(Reclamation recla :reclas)
		{
			long idDistrict = recla.getIdDistrict();
		
		}*/
		if(user != null){
			request.getRequestDispatcher("/historique_reclamation.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Utilisateur user = (Utilisateur) session.getAttribute("user");	
		
		long idUtilisateur = user.getIdUtilisateur();
		
		List<Reclamation> reclas = metier.reclamationParId(idUtilisateur);
		if (!reclas.isEmpty() ){
			request.setAttribute("reclas", reclas);
			List<District> dists = metierDis.listDistrict();
			request.setAttribute("dists", dists);
		}else{
			request.setAttribute("message", "Vous n'avez aucune reclamation");
		}
		
		if(user != null){
			request.getRequestDispatcher("/historique_reclamation.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
	}

}
