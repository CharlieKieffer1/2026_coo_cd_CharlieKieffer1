package test;

import static org.junit.Assert.*;

import org.junit.Test;

import donnees.CD;
import donnees.Magasin;

/**
 * classe de test de la classe Magasin (méthodes de tri)
 */
public class TestMagasin {

	@Test
	/**
	 * test de la methode triArtiste
	 */
	public void testTriArtiste() {
		// preparation des donnees
		Magasin m = new Magasin();
		CD cd1;
		cd1 = new CD("Bieber", "Believe");
		m.ajouteCd(cd1);
		CD cd2 = new CD("Red Hot Chili Pepper", "Californication");
		m.ajouteCd(cd2);
		CD cd3 = new CD("Vian", "Le deserteur");
		m.ajouteCd(cd3);
		CD cd4 = new CD("Juliette", "Mutatis Mutandis");
		m.ajouteCd(cd4);

		// methode de tri
		m.trierAriste();

		// verification
		CD cd = m.getCd(0);
		// test references
		assertEquals("Bieber plus petit nom", cd, cd1);
		cd = m.getCd(1);
		assertEquals("Juliette ensuite", cd, cd4);
		cd = m.getCd(2);
		assertEquals("Red Hot ensuite", cd, cd2);
		cd = m.getCd(3);
		assertEquals("Vian dernier", cd, cd3);
	}

	@Test
	/**
	 * test de la methode triArtiste quand deja trie
	 */
	public void testTriArtiste_DejaTrie() {
		// preparation des donnees
		Magasin m = new Magasin();
		CD cd1 = new CD("Bieber", "Believe");
		CD cd2 = new CD("Red Hot Chili Pepper", "Californication");
		CD cd3 = new CD("Vian", "Le deserteur");
		CD cd4 = new CD("Juliette", "Mutatis Mutandis");
		m.ajouteCd(cd1);
		m.ajouteCd(cd4);
		m.ajouteCd(cd2);
		m.ajouteCd(cd3);

		// methode de tri
		m.trierAriste();

		// verification
		CD cd = m.getCd(0);
		// test references
		assertEquals("Bieber plus petit nom", cd, cd1);
		cd = m.getCd(1);
		assertEquals("Juliette ensuite", cd, cd4);
		cd = m.getCd(2);
		assertEquals("Red Hot ensuite", cd, cd2);
		cd = m.getCd(3);
		assertEquals("Vian dernier", cd, cd3);
	}

	@Test
	/**
	 * test de la methode triArtiste quand vide
	 */
	public void testTriArtiste_Vide() {
		// preparation des donnees
		Magasin m = new Magasin();
		// methode de tri
		m.trierAriste();
	}

	/**
	 * test de la methode triAlbum quand trie
	 */
	@Test
	public void testTriAlbum_DejaTrie() {
		// preparation des donnees
		Magasin m = new Magasin();
		CD cd1;
		cd1 = new CD("Bieber", "Believe");
		m.ajouteCd(cd1);
		CD cd2 = new CD("Red Hot Chili Pepper", "Californication");
		m.ajouteCd(cd2);
		CD cd3 = new CD("Vian", "Le deserteur");
		m.ajouteCd(cd3);
		CD cd4 = new CD("Juliette", "Mutatis Mutandis");
		m.ajouteCd(cd4);

		// methode de tri
		m.trierAlbum();

		// verification
		CD cd = m.getCd(0);
		// test references
		assertEquals("Believe plus petit album", cd1, cd);
		cd = m.getCd(1);
		assertEquals("Californication ensuite", cd2, cd);
		cd = m.getCd(2);
		assertEquals("Le deserteur", cd3, cd);
		cd = m.getCd(3);
		assertEquals("Mutatis Mutandis", cd4, cd);
	}

	@Test
	/**
	 * test de la methode triAlbum quand non trie
	 */
	public void testTriAlbum_NonTrie() {
		// preparation des donnees
		Magasin m = new Magasin();
		CD cd1 = new CD("Bieber", "Believe");
		CD cd2 = new CD("Red Hot Chili Pepper", "Californication");
		CD cd3 = new CD("Vian", "Le deserteur");
		CD cd4 = new CD("Juliette", "Mutatis Mutandis");
		m.ajouteCd(cd1);
		m.ajouteCd(cd4);
		m.ajouteCd(cd2);
		m.ajouteCd(cd3);

		// methode de tri
		m.trierAlbum();

		// verification
		CD cd = m.getCd(0);
		// test references
		assertEquals("Believe plus petit album", cd1, cd);
		cd = m.getCd(1);
		assertEquals("Californication ensuite", cd2, cd);
		cd = m.getCd(2);
		assertEquals("Le deserteur", cd3, cd);
		cd = m.getCd(3);
		assertEquals("Mutatis Mutandis", cd4, cd);
	}

	@Test
	/**
	 * test de la methode triAlbum quand vide
	 */
	public void testTriAlbum_Vide() {
		// preparation des donnees
		Magasin m = new Magasin();
		// methode de tri
		m.trierAlbum();
	}

}
