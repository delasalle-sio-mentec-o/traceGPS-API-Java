package jim.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import jim.classes.Outils;
import jim.classes.Utilisateur;

public class UtilisateurTest {
	
	private Utilisateur utilisateur1;
	private Utilisateur utilisateur2;
	
	@Before
	public void setUp() throws Exception {
		utilisateur1 = new Utilisateur();
		
		int unId = 111;
		String unPseudo = "toto";
		String unMdpSha1 = "abcdef";
		String uneAdrMail = "toto@free.fr";
		String unNumTel = "1122334455";
		int unNiveau = 1;
		Date uneDateCreation = Outils.convertirEnDateHeure("21/06/2016 14:00:00");
		int unNbTraces = 3;
		Date uneDateDerniereTrace = Outils.convertirEnDateHeure("28/06/2016 14:00:00");
		utilisateur2 = new Utilisateur(unId, unPseudo, unMdpSha1, uneAdrMail, unNumTel, unNiveau, uneDateCreation, unNbTraces, uneDateDerniereTrace);
	}

	@Test
	public void testGetId() {
		assertEquals("Test getId", 0, utilisateur1.getId());	
		assertEquals("Test getId", 111, utilisateur2.getId());	
	}

	@Test
	public void testSetId() {
		utilisateur1.setId(4);
		utilisateur2.setId(5);
		assertEquals("Test setId", 4, utilisateur1.getId());	
		assertEquals("Test setId", 5, utilisateur2.getId());
	}

	@Test
	public void testGetPseudo() {
		assertEquals("Test getPseudo", "", utilisateur1.getPseudo());	
		assertEquals("Test getPseudo", "toto", utilisateur2.getPseudo());	
	}

	@Test
	public void testSetPseudo() {
		utilisateur1.setPseudo("jean");
		utilisateur2.setPseudo("charles");
		assertEquals("Test setPseudo", "jean", utilisateur1.getPseudo());	
		assertEquals("Test setPseudo", "charles", utilisateur2.getPseudo());
	}

	@Test
	public void testGetMdpSha1() {
		assertEquals("Test getMdpSha1", "", utilisateur1.getMdpSha1());	
		assertEquals("Test getMdpSha1", "abcdef", utilisateur2.getMdpSha1());
	}

	@Test
	public void testSetMdpSha1() {
		utilisateur1.setMdpSha1("zqsd");
		utilisateur2.setMdpSha1("azer");
		assertEquals("Test setMdpSha1", "zqsd", utilisateur1.getMdpSha1());	
		assertEquals("Test setMdpSha1", "azer", utilisateur2.getMdpSha1());
	}

	@Test
	public void testGetAdrMail() {
		assertEquals("Test getAdrMail", "", utilisateur1.getAdrMail());	
		assertEquals("Test getAdrMail", "toto@free.fr", utilisateur2.getAdrMail());
	}

	@Test
	public void testSetAdrMail() {
		utilisateur1.setAdrMail("mentec@gmail.com");
		utilisateur2.setAdrMail("oui@gmail.com");
		assertEquals("Test setAdrMail", "mentec@gmail.com", utilisateur1.getAdrMail());	
		assertEquals("Test setAdrMail", "oui@gmail.com", utilisateur2.getAdrMail());
	}

	@Test
	public void testGetNumTel() {
		assertEquals("Test getNumTel", "", utilisateur1.getNumTel());	
		assertEquals("Test getNumTel", "11.22.33.44.55", utilisateur2.getNumTel());
	}

	@Test
	public void testSetNumTel() {
		utilisateur1.setNumTel("2233445566");
		utilisateur2.setNumTel("9988776655");
		assertEquals("Test setNumTel", "22.33.44.55.66", utilisateur1.getNumTel());	
		assertEquals("Test setNumTel", "99.88.77.66.55", utilisateur2.getNumTel());
	}

	@Test
	public void testGetNiveau() {
		assertEquals("Test getNiveau", 0, utilisateur1.getNiveau());	
		assertEquals("Test getNiveau", 1, utilisateur2.getNiveau());
	}

	@Test
	public void testSetNiveau() {
		utilisateur1.setNiveau(2);
		utilisateur2.setNiveau(4);
		assertEquals("Test setNiveau", 2, utilisateur1.getNiveau());	
		assertEquals("Test setNiveau", 4, utilisateur2.getNiveau());
	}

	@Test
	public void testGetDateCreation() {
		assertEquals("Test getDateCreation", null, utilisateur1.getDateCreation());	
		assertEquals("Test getDateCreation", "21/06/2016 14:00:00", utilisateur2.getDateCreation());
	}

	@Test
	public void testSetDateCreation() throws ParseException {
		utilisateur1.setDateCreation(Outils.convertirEnDateHeure("22/06/2016 14:30:00"));
		utilisateur2.setDateCreation(Outils.convertirEnDateHeure("23/06/2016 14:42:00"));
		assertEquals("Test setDateCreation", "22/06/2016 14:30:00", utilisateur1.getDateCreation());	
		assertEquals("Test setDateCreation", "23/06/2016 14:42:00", utilisateur2.getDateCreation());
	}

	@Test
	public void testGetNbTraces() {
		assertEquals("Test getNbTraces", 0, utilisateur1.getNbTraces());	
		assertEquals("Test getNbTraces", 3, utilisateur2.getNbTraces());
	}

	@Test
	public void testSetNbTraces() {
		utilisateur1.setNbTraces(12);
		utilisateur2.setNbTraces(42);
		assertEquals("Test setNbTraces", 12, utilisateur1.getNbTraces());	
		assertEquals("Test setNbTraces", 42, utilisateur2.getNbTraces());
	}

	@Test
	public void testGetDateDerniereTrace() {
		assertEquals("Test getDateDerniereTrace", null, utilisateur1.getDateDerniereTrace());	
		assertEquals("Test getDateDerniereTrace", "28/06/2016 14:00:00", utilisateur2.getDateDerniereTrace());
	}

	@Test
	public void testSetDateDerniereTrace() throws ParseException {
		utilisateur1.setDateDerniereTrace(Outils.convertirEnDateHeure("23/06/2016 14:30:00"));
		utilisateur2.setDateDerniereTrace(Outils.convertirEnDateHeure("24/06/2016 14:42:00"));
		assertEquals("Test setDateDerniereTrace", "23/06/2016 14:30:00", utilisateur1.getDateDerniereTrace());	
		assertEquals("Test setDateDerniereTrace", "24/06/2016 14:42:00", utilisateur2.getDateDerniereTrace());
	}

	@Test
	public void testToString() {
		String msg = "";
	    msg += "id : " + "0" + "\n";
	    msg += "pseudo : " + "" + "\n";
	    msg += "mdpSha1 : " + "" + "\n";
	    msg += "adrMail : " + "" + "\n";
	    msg += "numTel : " + "" + "\n";
	    msg += "niveau : " + "0" + "\n";
	    msg += "nbTraces : " + "0" + "\n";
	    assertEquals("Test toString", msg, utilisateur1.toString());
	    
		msg = "";
	    msg += "id : " + "111" + "\n";
	    msg += "pseudo : " + "toto" + "\n";
	    msg += "mdpSha1 : " + "abcdef" + "\n";
	    msg += "adrMail : " + "toto@free.fr" + "\n";
	    msg += "numTel : " + "11.22.33.44.55" + "\n";
	    msg += "niveau : " + "1" + "\n";
	    msg += "dateCreation : " + "21/06/2016 14:00:00" + "\n";
	    msg += "nbTraces : " + "3" + "\n";
	    msg += "dateDerniereTrace : " + "28/06/2016 14:00:00" + "\n";
	    assertEquals("Test toString", msg, utilisateur2.toString());
	}

}
