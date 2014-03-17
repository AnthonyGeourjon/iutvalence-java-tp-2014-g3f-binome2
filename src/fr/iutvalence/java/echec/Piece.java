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
	 *            devient la position de la pièce
	 */
	public void deplacer(Position nouvellePosition)
	{
		this.positionDeLaPiece = nouvellePosition;
	}

	// TODO écrire un commentaire
	public String toString()
	{
		return ("Le propriétaire est " + propriétaire + ", sa position est "
				+ positionDeLaPiece + ".\n");
	}

}
