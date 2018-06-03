package com.sonede.mvc.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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


public class ControleurReclamationServlet extends HttpServlet {
	
	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
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
		
		List<District> dists = metierDis.listDistrict();
		request.setAttribute("dists", dists);
		
		if(user != null){
			request.getRequestDispatcher("/nouvelle_reclamation.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Date date0 = new Date();
		
		HttpSession session = request.getSession();
		Utilisateur user = (Utilisateur) session.getAttribute("user");	
		
		if(user != null){
			long idUtilisateur = user.getIdUtilisateur();
			long idDistrict = Long.parseLong(request.getParameter("district"));
			int police = Integer.parseInt(request.getParameter("police"));
			int tournee = Integer.parseInt(request.getParameter("tournee"));
			int ordre = Integer.parseInt(request.getParameter("ordre"));
			String demandeur = request.getParameter("demandeur");
			String adresse = request.getParameter("adresse");
			int telrec = Integer.parseInt(request.getParameter("tel"));
			String emailrec = request.getParameter("email");
			String service = request.getParameter("service");
			String demande = request.getParameter("message");
			String date = sdf.format(date0);
			Reclamation recla = new Reclamation(idUtilisateur, idDistrict, police, tournee, ordre, demandeur, adresse, telrec, emailrec, service, demande, date);
			metier.saveReclamation(recla);
			
			
			request.getRequestDispatcher("/hreclamation").forward(request, response);
		}else{
			request.getRequestDispatcher("/connexion").forward(request, response);	
		}
	}

}
