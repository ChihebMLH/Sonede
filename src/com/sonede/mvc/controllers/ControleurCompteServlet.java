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

public class ControleurCompteServlet extends HttpServlet {
	
	
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
		/*HttpSession session = request.getSession();
		/*Long idUser = (long) session.getAttribute("user");
		Utilisateur user = metier.getUtilisateur(idUser);
		request.setAttribute("user", user);*/
		
		List<District> dists = metierDis.listDistrict();
		request.setAttribute("dists", dists);
		
		
		
		if(user != null){
			request.getRequestDispatcher("/votre_compte.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
		
	}

}
