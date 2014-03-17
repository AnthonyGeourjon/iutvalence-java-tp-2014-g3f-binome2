package fr.iutvalence.java.echec;

/**
 * Represente la position d'un pièce d'échec sur un échiquier.
 */
public class Position
{

	/** Ligne de la position. */
	private final int ligne;

	/** Colonne de la position. */
	private final int colonne;

	/**
	 * @param nouvellePositionColonne
	 *            de la piece
	 * @param nouvellePositionLigne
	 *            de la piece
	 */
	public Position(int nouvellePositionColonne, int nouvellePositionLigne)
	{
		this.colonne = nouvellePositionColonne;
		this.ligne = nouvellePositionLigne;
	}

	// TODO écrire un commentaire
	public String toString()
	{
		return ("(" + colonne + "," + ligne + ")");
	}

}
