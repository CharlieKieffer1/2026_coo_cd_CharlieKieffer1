package donnees;

import java.util.ArrayList;
import java.util.List;

public class Magasin {

	private List<CD> listeCds;

	/**
	 * construit un magasin par defaut
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	public String toString() {
		String chaineResultat = "";
		for (CD cd : listeCds) {
			chaineResultat += cd;
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	
	/**
	 * retourne nombre de cds
	 * 
	 * @return
	 */
	public int getNombreCds() {
		return this.listeCds.size();
	}

	/**
	 * permet d'acceder a un CD
	 * 
	 * @return le cd a l'indice i
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}
	
	// TODO ajouter methode de tri
	
	/**
	 * permet de trier par nom d'artistes
	 * 
	 * @param compareur
	 *            le comparateur de Cd
	 */
	public void trier(ComparateurCd compareur) {
		// tri par selection
		int nbCDs = this.listeCds.size();
		for (int i = 0; i < nbCDs; i++) {
			CD cdSelectionne = this.listeCds.get(i);
			int indiceSelection = i;
			for (int j = i + 1; j < nbCDs; j++) {
				CD cdTemp = listeCds.get(j);
				if (compareur.estAvant(cdTemp, cdSelectionne)) {
					indiceSelection = j;
					cdSelectionne = cdTemp;
				}
			}
			listeCds.set(indiceSelection, listeCds.get(i));
			listeCds.set(i, cdSelectionne);
		}
	}
	
	// FinTODO ajouter une methode de tri

}
