package com.sonede.mvc.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonede.mvc.dao.IFactureDao;
import com.sonede.mvc.dao.impl.FactureDaoImpl;


public class ControleurSucces_paiementServlet extends HttpServlet{
	
	private IFactureDao metier;
	
	@Override
	public void init() throws ServletException {
		metier = new FactureDaoImpl();		
	}
	

	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long idFacture = Long.parseLong(request.getParameter("custom"));
		metier.updateFacture(idFacture);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Long idFacture = Long.parseLong(request.getParameter("custom"));
		metier.updateFacture(idFacture);
		
	}
}
