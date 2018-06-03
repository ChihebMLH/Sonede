package com.sonede.mvc.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sonede.mvc.beans.Abonne;
import com.sonede.mvc.beans.District;
import com.sonede.mvc.beans.Facture;
import com.sonede.mvc.beans.Trimestre;
import com.sonede.mvc.beans.Utilisateur;
import com.sonede.mvc.dao.IDistrictDao;
import com.sonede.mvc.dao.IFactureDao;
import com.sonede.mvc.dao.ITrimestreDao;
import com.sonede.mvc.dao.impl.DistrictDaoImpl;
import com.sonede.mvc.dao.impl.FactureDaoImpl;
import com.sonede.mvc.dao.impl.TrimestreDaoImpl;

public class ControleurHFactureServlet extends HttpServlet {	

	private IFactureDao metier;
	private IDistrictDao metierDis;
	private ITrimestreDao metierTrim;
	
	
	@Override
	public void init() throws ServletException {
		metier = new FactureDaoImpl();
		metierDis = new DistrictDaoImpl();
		metierTrim = new TrimestreDaoImpl();
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
			List<Trimestre> trims = metierTrim.listTrimestre();
			request.setAttribute("trims", trims);
			List<District> dists = metierDis.listDistrict();
			request.setAttribute("dists", dists);
		
		}else{
			request.setAttribute("message", "Vous n'avez aucune factures");
		}
		
		//Facture fat = metier.getFacture(idFacture);
		if(user != null){
			request.getRequestDispatcher("historique_facture.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Utilisateur user = (Utilisateur) session.getAttribute("user");
		
		//HttpSession session = request.getSession();
		//Abonne abonne = session.getAttribute("abonne");
		//Long idAbonne = (long) session.getAttribute("abonne.idAbonne");
		
		//List<Facture> facts = metier.factureParId((long) 9);
		//request.setAttribute("facts", facts);
		
		//Facture fat = metier.getFacture(idFacture);
		if(user != null){
			request.getRequestDispatcher("historique_facture.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
		
		

	}

}
