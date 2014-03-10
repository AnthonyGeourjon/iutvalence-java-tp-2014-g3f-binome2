package fr.iutvalence.java.echec;

/**
 * Represente la position d'un pièce d'échec sur un échiquier.
 */
public class Position
{
	
	/** Ligne de la postion. */
	private final int ligne ;
	
	/** Colonne de la position. */
	private final int colonne ;
	
	
	/**
	 * Instantiates a new position.
	 *
	 * @param nouvellePositionColonne position de la colonne
	 * @param nouvellePositionLigne position de la ligne
	 */
	public Position(int nouvellePositionColonne, int nouvellePositionLigne) 
	{
		this.colonne=nouvellePositionColonne;
		this.ligne=nouvellePositionLigne;
	}
	
	/**
	 * Change la position
	 * @param nouvellePositionColonne la nouvelle position colonne
	 * @param nouvellePositionLigne la nouvelle position ligne
	 * @return vraie, si les parametres était correcte
	 */

}
