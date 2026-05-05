package comparateur;

import donnees.CD;
import donnees.ComparateurCd;


public class ComparateurAlbum implements ComparateurCd {

	@Override
	public boolean estAvant(CD cd1, CD cd2) {
		return cd1.getNomCD().compareTo(cd2.getNomCD())<0;
	}

}
