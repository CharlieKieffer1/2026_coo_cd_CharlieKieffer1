package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import donnees.Magasin;
import XML.ChargeurMagasin;

/**
 * verifie que le chargement fonctionne bien
 */
public class TestChargeurMagasin {

	@Test
	/**
	 * tester que le chargement fonctionne bien quand le repertoire existe
	 */
	public void testChargerMagasinOK() throws IOException {
		//preparation des donnees
		ChargeurMagasin chargeurMagasin=new ChargeurMagasin("../magasinCD_donnees/musicbrainzSimple");
		
		//methode testee
		Magasin m=chargeurMagasin.chargerMagasin();
		
		//verification
		int nombre=m.getNombreCds();
		assertEquals("magasin devrait avoir 12 Cds", 12,nombre);
	}
	
	@Test(expected=IOException.class)
	/**
	 * tester que le chargement leve IOException quand repertoire inexistant
	 */
	public void testChargerMagasinInconnu() throws IOException {
		//preparation des donnees
		ChargeurMagasin chargeurMagasin=new ChargeurMagasin("../magasinCD_donnees/X");
		
		//methode testee
		chargeurMagasin.chargerMagasin();
	}

}
