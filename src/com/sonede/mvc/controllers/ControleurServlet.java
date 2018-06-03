package com.sonede.mvc.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.sonede.mvc.dao.IUtilisateurDao;
import com.sonede.mvc.dao.impl.UtilisateurDaoImpl;

public class ControleurServlet extends HttpServlet{
	
	private IUtilisateurDao metier;
	
	@Override
	public void init() throws ServletException {
		metier = new UtilisateurDaoImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String path=request.getServletPath();
		//String action = request.getParameter("action");	
		
		
		//if(path.equals("/index")){
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
			
			
		//}		
		
		/*else if (StringUtils.isNullOrEmpty(action)){		
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}*/		
		/*else if (action.equals("chercher")){
			String motCle = "aa2";
			AbonneModel model = new AbonneModel();
			model.setMotCle(motCle);
			//System.out.println(motCle);
			List<Abonne> abonnes = metier.AbonneParId("%"+motCle+"%");
			model.setAbonnes(abonnes);
			request.setAttribute("model", model);
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			
		}
		*/
		/*else if(path.equals("/connexion") ){
			this.getServletContext().getRequestDispatcher("/se_connecter.jsp").forward(request, response);

			String email = request.getParameter("email");
			String mot_de_passe = request.getParameter("mot_de_passe");		
			Long idUser = metier.checkLogin(email, mot_de_passe);
			
				if(idUser!=null){
					
					HttpSession session = request.getSession();
					session.setAttribute("idUser", idUser);
					response.sendRedirect("index");
				}
				else 
				{
					
					response.sendRedirect("connexion");
					
					}  
			

			
		}*/
	}





		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			doGet(request, response);
	
	
		}

}