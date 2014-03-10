package fr.iutvalence.java.echec;

/**
 * Represente une pièce de jeu.
 */
public abstract class Piece
{

	/** Position de la pièce. */
	private Position positionDeLaPiece;

	/**
	 * Reference du joueur auquel la piece appartient
	 */
	private Joueur propriétaire;

	/**
	 * Deplacement de la pièce
	 * 
	 * @param nouvellePosition
	 *            -> nouvelle position de la piece
	 */
	public void deplacer(Position nouvellePosition)
	{
		this.positionDeLaPiece = nouvellePosition;
	}
}
