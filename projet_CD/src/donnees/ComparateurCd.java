package donnees;


/**
 * interface pour comparer deux CDs
 * @author vthomas
 *
 */
public interface ComparateurCd {

	/**
	 * permet de savoir si un cd est avant un autre
	 * @param cd1 premier cd
	 * @param cd2 seconde cd 
	 * @return vrai si et seulement si cd1 est avant cd2
	 */
	public boolean estAvant(CD cd1,CD cd2);
	
}
