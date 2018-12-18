package jim.testsvisuels;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class TestPasserelleServicesWebXML {

	public static void main(String[] args) throws ParseException {
		
		String msg;
	
		// test visuel de la méthode getTousLesUtilisateurs
		
//		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
//		msg = PasserelleServicesWebXML.getTousLesUtilisateurs("galileo", Outils.sha1("mdputilisateur"), lesUtilisateurs);
//		// affichage de la réponse
//		System.out.println(msg);
//		// affichage du nombre d'utilisateurs
//		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
//		// affichage de tous les utilisateurs
//		for (Utilisateur unUtilisateur : lesUtilisateurs)
//		{	System.out.println(unUtilisateur.toString());
//		}


		// test visuel de la méthode getLesUtilisateursQueJautorise
//		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
//		msg = PasserelleServicesWebXML.getLesUtilisateursQueJautorise("galileo", Outils.sha1("mdputilisateur"), lesUtilisateurs);
//		// affichage de la réponse
//		System.out.println(msg);
//		// affichage du nombre d'utilisateurs
//		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
//		// affichage de tous les utilisateurs
//		for (Utilisateur unUtilisateur : lesUtilisateurs)
//		{	System.out.println(unUtilisateur.toString());
//		}


		// test visuel de la méthode getLesUtilisateursQuiMautorisent
//		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
//		msg = PasserelleServicesWebXML.getLesUtilisateursQuiMautorisent("galileo", Outils.sha1("mdputilisateur"), lesUtilisateurs);
//		// affichage de la réponse
//		System.out.println(msg);
//		// affichage du nombre d'utilisateurs
//		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
//		// affichage de tous les utilisateurs
//		for (Utilisateur unUtilisateur : lesUtilisateurs)
//		{	System.out.println(unUtilisateur.toString());
//		}

		
		// test visuel de la méthode getUnParcoursEtSesPoints
//		Trace laTrace = new Trace();
//		msg = PasserelleServicesWebXML.getUnParcoursEtSesPoints("europa", Outils.sha1("mdputilisateur"), 2, laTrace);
//		// affichage de la réponse
//		System.out.println(msg);
//		// affichage de la trace
//		System.out.println(laTrace.toString());



		// test visuel de la méthode getLesParcoursDunUtilisateur
		ArrayList<Trace> lesTraces = new ArrayList<Trace>();
		msg = PasserelleServicesWebXML.getLesParcoursDunUtilisateur("europa", Outils.sha1("mdputilisateur"), "callisto", lesTraces);
		// affichage de la réponse
		System.out.println(msg);
		// affichage du nombre de traces
		System.out.println("Nombre de traces : " + lesTraces.size());
		// affichage de tous les utilisateurs
		for (Trace uneTrace : lesTraces)
		{	System.out.println(uneTrace.toString());
		}

		
		
		

	
	} // fin Main
} // fin class
