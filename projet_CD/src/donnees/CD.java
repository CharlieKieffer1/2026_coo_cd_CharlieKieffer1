package donnees;

import java.util.ArrayList;
import java.util.List;

public class CD {
	
	/**
	 * separation entre CD
	 */
	private static final String SEPARATOR = "--------------------------------------\n";
	private String nomArtiste;
	private String nomCD;
	
	/**
	 * les pistes du CD
	 */
	private List<InfoPiste> pistes;
	
	
	/**
	 * constructeur simple
	 * @param artiste
	 * @param nomCDParam
	 */
	public CD(String artiste, String nomCDParam)
	{
		this.setNomArtiste(artiste);
		this.setNomCD(nomCDParam);
		
		this.pistes=new ArrayList<InfoPiste>();
	}
	
	/**
	 * ajoute un piste au CD
	 * @param infoPiste
	 */
	public void ajouterPiste(InfoPiste infoPiste)
	{
		pistes.add(infoPiste);
	}	
	
	
	@Override
	public String toString()
	{
		String r=SEPARATOR;
		r+=this.getNomArtiste()+" - "+this.getNomCD()+ " ("+pistes.size()+" pistes)\n";
		for (int i=0;i<this.pistes.size();i++)
		{
			InfoPiste piste = pistes.get(i);
			r+="   ."+numeroPiste(i)+". "+piste+"\n";
		}
		r+=SEPARATOR;
		return(r);
	}


	/**
	 * retourne une chaine correspondant au numero de piste (sur deux char)
	 * @param i
	 * @return
	 */
	private String numeroPiste(int i) {
		int numPiste = i+1;
		String resultat=""+numPiste;
		if (numPiste<10)
			resultat="0"+resultat;
		return(resultat);
	}

	public int getnbPistes() {
		return this.pistes.size();
	}

	public String getNomCD() {
		return nomCD;
	}

	public void setNomCD(String nomCD) {
		this.nomCD = nomCD;
	}

	public String getNomArtiste() {
		return nomArtiste;
	}

	public void setNomArtiste(String nomArtiste) {
		this.nomArtiste = nomArtiste;
	}
	
}
