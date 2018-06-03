package com.sonede.mvc.dao.impl;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.sonede.mvc.beans.Abonne;
import com.sonede.mvc.beans.Facture;
import com.sonede.mvc.beans.Reclamation;
import com.sonede.mvc.beans.Utilisateur;
import com.sonede.mvc.dao.IAbonneDao;
import com.sonede.mvc.dao.IFactureDao;
import com.sonede.mvc.dao.IReclamationDao;
import com.sonede.mvc.dao.IUtilisateurDao;

public class TestDao {

	public static void main(String[] args) {
		IAbonneDao dao = new AbonneDaoImpl();
		IUtilisateurDao dao1 = new UtilisateurDaoImpl();
		IFactureDao dao3 = new FactureDaoImpl();
		IReclamationDao dao4 = new ReclamationDaoImpl();
		/*Abonne a1 = dao.saveAbonne(new Abonne("aa1", "aa", "aa", 111, 111));
		Abonne a2 = dao.saveAbonne(new Abonne("aa2", "aa", "aa", 111, 111));
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println("Chercher un Abonne");
		List<Abonne> abs = dao.AbonneParId("%aa%");
		for(Abonne ab :abs){
			System.out.println(ab.toString());			
		}
		

		Utilisateur user1 = dao1.saveUtilisateur(new Utilisateur("aa3", "aa", "aa", 11, 11, "aaaa@aa.a", "13"));
		Utilisateur user2 = dao1.saveUtilisateur(new Utilisateur("aa4", "aa", "aa", 11, 11, "aaaa2@aa.a", "14"));
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		*/
		
		/*boolean rs = dao1.checkLogin("aaaa2@aa.a", "12");
		if (rs){
			System.out.println(rs);
		}
		else {
			System.out.println(rs);
		}*/
		
		/*Utilisateur user1 = dao1.getUtilisateur((long) 11);
		System.out.println(user1.toString());*/
		
		/*List<Utilisateur> users = dao1.utilisateurParDistrict("aa");
		for(Utilisateur user2 : users){
			
			System.out.println(user2.toString());
		} */
		
		//dao1.deleteUtilisateur((long) 6);
		
		/*Utilisateur user2 = new Utilisateur("bb", "bb", "bb", 22, 22, "bb@b.b", "bb");
		user2.setIdUtilisateur((long) 13);
		
		Utilisateur user1 = dao1.updateUtilisateur(user2);
		System.out.println(user1.toString());*/
		
		/*long ti= (2020-12-1);
		Date d = new Date(ti);
		System.out.println(d);*/
		
		
		//Abonne a1 = dao.saveAbonne(new Abonne("benfoulen", "foulen", "tunis 02", 01234567, 22222222));
		//Long user2 = dao1.saveUtilisateur(new Utilisateur("benfoulen", "foulen", "tunis 02", 01234567, 22222222, "foulen@f.f", "f"));
		
		//Abonne abonne = dao1.checkAbonnne((long)23);
		//System.out.println(abonne.toString());
		
		/*List<Facture> facts = dao3.FactureParId((long)9);
		for(Facture fact :facts){
			System.out.println(fact.toString());			
		}*/
		
		/*Facture fact = dao3.getFacture((long)2);
		System.out.println(fact.toString());*/
		
		/*DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date0 = new Date();
		
		String date = sdf.format(date0);

		
		Reclamation rec1 = new Reclamation((long) 23, (long) 1, 1, 1, 1, "Foulen","tunis 02", 22222, "foulen@f.f", "Casse d'eaux", "bonjour je souhaite deposer une reclamation",date);	
		dao4.saveReclamation(rec1);*/
		
		/*List<Reclamation> reclas = dao4.reclamationParId((long)23);
		for(Reclamation recla :reclas){
			System.out.println(recla.toString());
		}*/
		
		
		/*Reclamation rec1= dao4.getReclamation((long)2);
		rec1.setTelrec(222333);
		Reclamation rec= dao4.updateReclamation(rec1);
		System.out.println(rec.toString());*/
				
		//dao4.deleteReclamation((long)2);
		
		
		/*List<Integer> consos = dao3.ListeConsoEaux((long)9);
		for(int conso :consos){
			System.out.println(conso);
		}*/
		
		
		/*int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);*/
		

	}

}
