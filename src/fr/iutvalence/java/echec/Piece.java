package fr.iutvalence.java.echec;

/**
 * La classe Piece.
 */
public class Piece
{
	
	/** Le proprietaire de la piece. */
	private Joueur proprietaire;

	/** La position de la piece. */
	private Position positionDeLaPiece;

	/**
	 * Deplacer la piece (changer de position).
	 *
	 * @param nouvellePosition la nouvelle position
	 */
	public void deplacer(Position nouvellePosition)
	{
		this.positionDeLaPiece = nouvellePosition;
	}
	
	/**
	 * Retirer piece (La piece est prise).
	 *
	 * @param pieceARetirer la piece a retirer
	 */
	public void retirerPiece(Piece pieceARetirer)
	{
		pieceARetirer=null;
		
	}

}
