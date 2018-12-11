package jim.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import jim.classes.Outils;
import jim.classes.PasserelleServicesWebXML;
import jim.classes.Point;
import jim.classes.PointDeTrace;
import jim.classes.Trace;
import jim.classes.Utilisateur;

public class PasserelleServiceWebXMLTest {
	
	//@Test
//	public void testConnecter() {
//		String msg = PasserelleServicesWebXML.connecter("admin", "adminnnnnnnn");
//		assertEquals("Erreur : authentification incorrecte.", msg);
//		
//		msg = PasserelleServicesWebXML.connecter("admin", Outils.sha1("mdpadmin"));
//		assertEquals("Administrateur authentifié.", msg);
//		
//		msg = PasserelleServicesWebXML.connecter("europa", Outils.sha1("mdputilisateur"));
//		assertEquals("Utilisateur authentifié.", msg);	
//	}

		
	@Test
	public void testCreerUnUtilisateur() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSupprimerUnUtilisateur() {
		fail("Not yet implemented");	
	}
	
	//@Test
//	public void testChangerDeMdp() {
//		String msg = PasserelleServicesWebXML.changerDeMdp("europa", Outils.sha1("mdputilisateur"), "passepasse", "passepassepasse");
//		assertEquals("Erreur : le nouveau mot de passe et sa confirmation sont différents.", msg);
//		
//		msg = PasserelleServicesWebXML.changerDeMdp("europa", Outils.sha1("mdputilisateurrrr"), "passepasse", "passepasse");
//		assertEquals("Erreur : authentification incorrecte.", msg);
//		
//		msg = PasserelleServicesWebXML.changerDeMdp("europa", Outils.sha1("mdputilisateur"), "mdputilisateurrrr", "mdputilisateurrrr");
//		assertEquals("Enregistrement effectué ; vous allez recevoir un courriel de confirmation.", msg);
//		
//		msg = PasserelleServicesWebXML.changerDeMdp("europa", Outils.sha1("mdputilisateurrrr"), "mdputilisateur", "mdputilisateur");
//		assertEquals("Enregistrement effectué ; vous allez recevoir un courriel de confirmation.", msg);
//	}	


	@Test
	public void testDemanderMdp() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDemanderUneAutorisation() {
		String msg = PasserelleServicesWebXML.demanderUneAutorisation("europa", Outils.sha1("mdputilisateurrrrrr"), "toto", "", "");
		assertEquals("Erreur : données incomplètes.", msg);

		msg = PasserelleServicesWebXML.demanderUneAutorisation("europa", Outils.sha1("mdputilisateurrrrrr"), "toto", "coucou", "charles-edouard");
		assertEquals("Erreur : authentification incorrecte.", msg);
		
		msg = PasserelleServicesWebXML.demanderUneAutorisation("europa", Outils.sha1("mdputilisateur"), "toto", "coucou", "charles-edouard");
		assertEquals("Erreur : pseudo utilisateur inexistant.", msg);
		
		msg = PasserelleServicesWebXML.demanderUneAutorisation("europa", Outils.sha1("mdputilisateur"), "galileo", "coucou", "charles-edouard");
		assertEquals("galileo va recevoir un courriel avec votre demande.", msg);	

	
	}	
	
	@Test
	public void testRetirerUneAutorisation() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEnvoyerPosition() throws ParseException {
		fail("Not yet implemented");
	}

	@Test
	public void testDemarrerEnregistrementParcours() {
		fail("Not yet implemented");
	}

	@Test
	public void testArreterEnregistrementParcours() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSupprimerUnUnParcours() {
		fail("Not yet implemented");
	}
	
} // fin du test
