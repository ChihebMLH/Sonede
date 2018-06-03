package com.sonede.mvc.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sonede.mvc.beans.Abonne;
import com.sonede.mvc.beans.Utilisateur;
import com.sonede.mvc.dao.IUtilisateurDao;
import com.sonede.mvc.dao.impl.UtilisateurDaoImpl;


public class ControleurConnexionServlet extends HttpServlet {
	
	private IUtilisateurDao metier;
	
	
	@Override
	public void init() throws ServletException {
		metier = new UtilisateurDaoImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/se_connecter.jsp").forward(request, response);
		
		/*String action = request.getParameter("action");
		String email = request.getParameter("email");
		String mot_de_passe = request.getParameter("mot_de_passe");
		
		if( action.equals("authentification"))
		{
		
			if(email.equals("aaaa@aa.a") && mot_de_passe.equals("11")){
			response.sendRedirect("index.jsp");
			}
			else  response.sendRedirect("index.jsp");
		}
		else
		request.getRequestDispatcher("/se_connecter.jsp").forward(request, response);*/
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		String email = request.getParameter("email");
		String mot_de_passe = request.getParameter("mot_de_passe");	
		
		if((email == "") || (mot_de_passe == "")){
			request.setAttribute("message", "Veuillez remplir tout les champs");
			request.getRequestDispatcher("/se_connecter.jsp").forward(request, response);
			
		}else{
			
			Long idUser = metier.checkLogin(email, mot_de_passe);
			
				if(idUser!=null){
					Utilisateur user = metier.getUtilisateur(idUser);
					
					HttpSession session = request.getSession();
					session.setAttribute("user", user);				
					
					// Trouvé l'abonnement de l'utilisateur et l'affecter a une session
					Abonne abonne = metier.checkAbonnne(idUser);				
					session.setAttribute("abonne", abonne);	
					
					response.sendRedirect("index");
					
				}else{
					
					request.setAttribute("message", "Email ou Mot de passe incorrect");
					request.getRequestDispatcher("/se_connecter.jsp").forward(request, response);
					
				}  
				
		}
		
		
	}


}



