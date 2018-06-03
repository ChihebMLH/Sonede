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

public class ControleurInscriptionServlet extends HttpServlet {
	
	private IUtilisateurDao metier;
	private IDistrictDao metierDis;
	
	
	@Override
	public void init() throws ServletException {
		metier = new UtilisateurDaoImpl();
		metierDis = new DistrictDaoImpl();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<District> dists = metierDis.listDistrict();
		request.setAttribute("dists", dists);
		
		request.getAttribute("messageCin");
		request.getRequestDispatcher("/inscription.jsp").forward(request, response);		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		int cin = Integer.parseInt(request.getParameter("cin"));
		int  tel = Integer.parseInt(request.getParameter("tel"));
		String email = request.getParameter("email");
		String motdepasse = request.getParameter("mot_de_passe");
		Long idDistrict = Long.parseLong(request.getParameter("idDistrict"));
		
		boolean resultCin = metier.checkCin(cin);
		boolean resultEmail = metier.checkEmail(email);
		boolean error = false;
		
		if(resultCin){
			error = true;
			request.setAttribute("messageCin", "Le CIN existe deja");
		}
		
		if(resultEmail){
			error = true;
			request.setAttribute("messageEmail", "L'adresse Email existe deja");
			
		}
		
		if(error){				
			request.getRequestDispatcher("/inscription.jsp").forward(request, response);
		}else{
			
			
			Utilisateur user = new Utilisateur(nom, prenom, adresse, cin, tel, email, motdepasse, idDistrict);
			Long idUser = metier.saveUtilisateur(user);
			user.setIdUtilisateur(idUser);
			
	
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("index");
		
		}		



	
	
	}

}
