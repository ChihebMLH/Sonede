package com.sonede.mvc.controllers;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sonede.mvc.beans.Abonne;
import com.sonede.mvc.beans.Facture;
import com.sonede.mvc.beans.Utilisateur;
import com.sonede.mvc.dao.IFactureDao;
import com.sonede.mvc.dao.impl.FactureDaoImpl;

public class ControleurConsommationServlet extends HttpServlet{
	
	
	private IFactureDao metier;
	
	
	@Override
	public void init() throws ServletException {
	metier = new FactureDaoImpl();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Utilisateur user = (Utilisateur) session.getAttribute("user");
		
		Abonne abonne = (Abonne) session.getAttribute("abonne");		
		if (abonne != null ){
			Long idAbonne = abonne.getIdAbonne();		
			List<Facture> facts = metier.factureParId(idAbonne);
			request.setAttribute("facts", facts);
			int annee_courante = Calendar.getInstance().get(Calendar.YEAR);
			request.setAttribute("annee_courante", annee_courante);
			request.setAttribute("message", "Votre consommation d'eau au cours de l'année : "+ String.valueOf(annee_courante));
		
		}else{
			request.setAttribute("message", "Vous n'avez aucune factures ");
		}
		
		
		
		
		if(user != null){
			request.getRequestDispatcher("/consommation.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
	}

}
