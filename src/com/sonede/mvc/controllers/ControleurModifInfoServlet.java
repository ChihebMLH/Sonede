package com.sonede.mvc.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sonede.mvc.beans.District;
import com.sonede.mvc.beans.Utilisateur;
import com.sonede.mvc.dao.IDistrictDao;
import com.sonede.mvc.dao.IUtilisateurDao;
import com.sonede.mvc.dao.impl.DistrictDaoImpl;
import com.sonede.mvc.dao.impl.UtilisateurDaoImpl;

public class ControleurModifInfoServlet extends HttpServlet {
	
	
	private IUtilisateurDao metier;
	private IDistrictDao metierDis;
	
	
	@Override
	public void init() throws ServletException {
		metier = new UtilisateurDaoImpl();
		metierDis = new DistrictDaoImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Utilisateur user = (Utilisateur) session.getAttribute("user");
		List<District> dists = metierDis.listDistrict();
		request.setAttribute("dists", dists);
		
		if(user != null){
			request.getRequestDispatcher("/modifier_vos_informations.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Utilisateur user1 = (Utilisateur) session.getAttribute("user");
		if(user1 != null){
			Long idUtilisateur = Long.parseLong(request.getParameter("idUtilisateur"));
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String adresse = request.getParameter("adresse");		
			int cin =Integer.parseInt(request.getParameter("cin"));
			int tel =Integer.parseInt(request.getParameter("tel"));
			String email = request.getParameter("email");
			String motdepasse = request.getParameter("motdepasse");
			Long idDistrict = Long.parseLong(request.getParameter("idDistrict"));
			
			Utilisateur user = new Utilisateur(nom, prenom, adresse, cin, tel, email, motdepasse, idDistrict);
			user.setIdUtilisateur(idUtilisateur);
			metier.updateUtilisateur(user);
			
			Utilisateur user2 = metier.getUtilisateur(idUtilisateur);
			session.setAttribute("user", user2);
		
		
			request.getRequestDispatcher("/votre_compte.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}

	}

}
