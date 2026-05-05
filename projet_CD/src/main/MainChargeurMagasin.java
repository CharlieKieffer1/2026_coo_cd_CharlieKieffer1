package main;

import java.io.IOException;
import java.util.Scanner;

import comparateur.ComparateurAlbum;
import comparateur.ComparateurArtiste;
import comparateur.ComparateurPistes;
import donnees.Magasin;
import XML.ChargeurMagasin;

/**
 * permet de charger un magasin de test
 */
public class MainChargeurMagasin {

	/**
	 * methode principale
	 * 
	 * @param args
	 *            inutilise
	 * @throws IOException
	 *             en cas de probleme de lecture entree/sortie
	 */
	public static void main(String args[]) throws IOException {
		
		String repertoire = "src/musicbrainzSimple/";
		ChargeurMagasin charge = new ChargeurMagasin(repertoire);
		Magasin resultat = charge.chargerMagasin();
		System.out.println(resultat);

		System.out.println("Saisissez 1 pour trier par artiste, 2 par album et 3 par pistes");

		Scanner sc = new Scanner(System.in);
		switch (sc.nextLine()){
			case "1":
				resultat.trier(new ComparateurArtiste());
				break;
			case "2":
				resultat.trier(new ComparateurAlbum());
				break;
			case "3":
				resultat.trier(new ComparateurPistes());
				break;
		}
		System.out.println(resultat);
		sc.close();

	}

}
