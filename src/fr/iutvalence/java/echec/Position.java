package fr.iutvalence.java.echec;

/**
 * Represente la position d'un pièce d'échec sur un échiquier.
 */
public class Position
{
	
	/** Ligne de la postion. */
	private final int ligne ;
	
	/** Colonne de la position. */
	public final int colonne ;
	
	/**
	 * Change la position
	 * @param nouvellePositionColonne la nouvelle position colonne
	 * @param nouvellePositionLigne la nouvelle position ligne
	 * @return vraie, si les parametres était correcte
	 */
	public boolean setPostion(int nouvellePositionColonne, int nouvellePositionLigne)
	{
		if (nouvellePositionColonne>=8 || nouvellePositionLigne<=1)
			return false;
		this.ligne=nouvellePositionLigne;
		this.colonne=nouvellePositionColonne;
		return true;
	}
	
}
