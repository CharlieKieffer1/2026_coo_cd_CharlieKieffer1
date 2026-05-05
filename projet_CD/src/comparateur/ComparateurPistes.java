package comparateur;

import donnees.CD;
import donnees.ComparateurCd;

public class ComparateurPistes implements ComparateurCd{

	@Override
	public boolean estAvant(CD cd1, CD cd2) {
		if (cd1.getnbPistes()<cd2.getnbPistes())
			return(true);
		if (cd1.getnbPistes()>cd2.getnbPistes())
			return(false);
		
		ComparateurCd cal=new ComparateurArtiste();
		return(cal.estAvant(cd1, cd2));			
	}
	
}
