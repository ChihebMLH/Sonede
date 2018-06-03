package com.sonede.mvc.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControleurPagesServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path=request.getServletPath();
		
		if(path.equals("/p1.do")){			
			request.getRequestDispatcher("pages/p1.jsp").forward(request, response);
			
		
		}else if(path.equals("/p2.do")){
			request.getRequestDispatcher("pages/p2.jsp").forward(request, response);
			
			
		}else if(path.equals("/p3.do")){
			request.getRequestDispatcher("pages/p3.jsp").forward(request, response);
			
		
		}else if(path.equals("/p4.do")){
			request.getRequestDispatcher("pages/p4.jsp").forward(request, response);
			
			
		}else if(path.equals("/p5.do")){
			request.getRequestDispatcher("pages/p5.jsp").forward(request, response);
			
			
		}else if(path.equals("/p6.do")){
			request.getRequestDispatcher("pages/p6.jsp").forward(request, response);
			
			
		}else if(path.equals("/p7.do")){
			request.getRequestDispatcher("pages/p7.jsp").forward(request, response);
			
			
		}else if(path.equals("/p8.do")){
			request.getRequestDispatcher("pages/p8.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/p9.do")){
			request.getRequestDispatcher("pages/p9.jsp").forward(request, response);
			
			
		}else if(path.equals("/p10.do")){
			request.getRequestDispatcher("pages/p10.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/p11.do")){
			request.getRequestDispatcher("pages/p11.jsp").forward(request, response);
			
			
		}else if(path.equals("/p12.do")){
			request.getRequestDispatcher("pages/p12.jsp").forward(request, response);
			
			
		}else if(path.equals("/p13.do")){
			request.getRequestDispatcher("pages/p13.jsp").forward(request, response);
			
			
		}else if(path.equals("/p14.do")){
			request.getRequestDispatcher("pages/p14.jsp").forward(request, response);
			
			
		}else if(path.equals("/p15.do")){
			request.getRequestDispatcher("pages/p15.jsp").forward(request, response);
			
			
		}else if(path.equals("/p16.do")){
			request.getRequestDispatcher("pages/p16.jsp").forward(request, response);
			
			
		}else if(path.equals("/p17.do")){
			request.getRequestDispatcher("pages/p17.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/p18.do")){
			request.getRequestDispatcher("pages/p18.jsp").forward(request, response);
			
			
		}else if(path.equals("/p19.do")){
			request.getRequestDispatcher("pages/p19.jsp").forward(request, response);
			
			
		}else if(path.equals("/p20.do")){
			request.getRequestDispatcher("pages/p20.jsp").forward(request, response);
			
			
		}else if(path.equals("/p21.do")){
			request.getRequestDispatcher("pages/p21.jsp").forward(request, response);
			
			
		}else if(path.equals("/p22.do")){
			request.getRequestDispatcher("pages/p22.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/p23.do")){
			request.getRequestDispatcher("pages/p23.jsp").forward(request, response);
		
			
			
		}else if(path.equals("/p24.do")){
			request.getRequestDispatcher("pages/p24.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/p25.do")){
			request.getRequestDispatcher("pages/p25.jsp").forward(request, response);
			
			
		}else if(path.equals("/p26.do")){
			request.getRequestDispatcher("pages/p26.jsp").forward(request, response);
						
			
		}else if(path.equals("/p27.do")){
			request.getRequestDispatcher("pages/p27.jsp").forward(request, response);
			
			
		}else if(path.equals("/p28.do")){
			request.getRequestDispatcher("pages/p28.jsp").forward(request, response);
			
			
		}else if(path.equals("/p29.do")){
			request.getRequestDispatcher("pages/p29.jsp").forward(request, response);
			
			
		}else if(path.equals("/p30.do")){
			request.getRequestDispatcher("pages/p30.jsp").forward(request, response);
			
			
		}else if(path.equals("/p31.do")){
			request.getRequestDispatcher("pages/p31.jsp").forward(request, response);
			
			
		}else if(path.equals("/p32.do")){
			request.getRequestDispatcher("pages/p32.jsp").forward(request, response);
			
			
		}else if(path.equals("/p33.do")){
			request.getRequestDispatcher("pages/p33.jsp").forward(request, response);
			
			
		}else if(path.equals("/p34.do")){
			request.getRequestDispatcher("pages/p34.jsp").forward(request, response);
			
			
		}else if(path.equals("/p35.do")){
			request.getRequestDispatcher("pages/p35.jsp").forward(request, response);
			
			
		}else if(path.equals("/p36.do")){
			request.getRequestDispatcher("pages/p36.jsp").forward(request, response);
			
			
		}else if(path.equals("/p37.do")){
			request.getRequestDispatcher("pages/p37.jsp").forward(request, response);
			
			
		}else if(path.equals("/p38.do")){
			request.getRequestDispatcher("pages/p38.jsp").forward(request, response);
			
			
		}else if(path.equals("/p39.do")){
			request.getRequestDispatcher("pages/p39.jsp").forward(request, response);
			
			
		}else if(path.equals("/p40.do")){
			request.getRequestDispatcher("pages/p40.jsp").forward(request, response);
			
			
		}else if(path.equals("/p41.do")){
			request.getRequestDispatcher("pages/p41.jsp").forward(request, response);
			
			
		}else if(path.equals("/videotheque.do")){
			request.getRequestDispatcher("pages/videotheque.jsp").forward(request, response);
			
				
				
		}else if(path.equals("/phototheque.do")){
			request.getRequestDispatcher("pages/phototheque.jsp").forward(request, response);
			
			
		}else if(path.equals("/revue_de_presse.do")){
			request.getRequestDispatcher("pages/revue_de_presse.jsp").forward(request, response);
			
			
		}else if(path.equals("/apelledoffre46.do")){
			request.getRequestDispatcher("pages/apelledoffre46.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/apelledoffre42.do")){
			request.getRequestDispatcher("pages/apelledoffre42.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/apelledoffre44.do")){
			request.getRequestDispatcher("pages/apelledoffre44.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/coop1.do")){
			request.getRequestDispatcher("pages/coop1.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/nous_contacter.do")){
			request.getRequestDispatcher("pages/nous_contacter.jsp").forward(request, response);
			
			
			
		}else if(path.equals("/liensut.do")){
			request.getRequestDispatcher("pages/liensut.jsp").forward(request, response);
			
			
		}else if(path.equals("/consulter_fact.do")){
			
			
			request.getRequestDispatcher("pages/p7.jsp").forward(request, response);
			
			
			
			
			
			
			
			
			
			
			
			
		}else{
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			//response.sendError(Response.SC_NOT_FOUND);
		}

	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
