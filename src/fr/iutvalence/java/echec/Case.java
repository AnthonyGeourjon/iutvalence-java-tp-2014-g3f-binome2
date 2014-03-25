package fr.iutvalence.java.echec;

/**
 * @author geourjoa Cases d'un echiquier
 */
public class Case
{

	/**
	 * Piece presente sur la case, null si il n'y pas de piece
	 */
	private Piece pieceSurlaCase;

	/** La coordonne verticale. */
	private int coordonneVerticale;

	/** La coordonnee horizontale. */

	private int coordonneeHorizontale;

	/**
	 * Cree une nouvelle position.
	 * 
	 * @param nouvelleCoordonneVerticale
	 *            la nouvelle coordonne verticale
	 * @param nouvelleCoordonneHorizontale
	 *            la nouvelle coordonne horizontale
	 * @param piecesurlaCase
	 *            piece associé à la case
	 */
	public Case(int nouvelleCoordonneVerticale, int nouvelleCoordonneHorizontale, Piece piecesurlaCase)
	{
		this.coordonneVerticale = nouvelleCoordonneVerticale;
		this.coordonneeHorizontale = nouvelleCoordonneHorizontale;
		this.pieceSurlaCase = piecesurlaCase;

	}

	/**
	 * Obtenir la coordonnee verticale.
	 * 
	 * @return la coordonnee verticale
	 */
	public int getCoordonneeVerticale()
	{
		return this.coordonneVerticale;
	}

	/**
	 * Obtenir la coordonnee horizontale.
	 * 
	 * @return la coordonnee horizontale
	 */
	public int getCoordonneeHorizontale()
	{
		return this.coordonneeHorizontale;
	}

	/**
	 * @return la piece presente sur la case
	 */
	public Piece obtenirPiece()
	{
		// TODO Auto-generated method stub
		return this.pieceSurlaCase;
	}

	/**
	 * @param piece
	 *            mutateur de pieceSurLaCase
	 */
	public void poserPiece(Piece piece)
	{
		this.pieceSurlaCase = piece;
	}

	/**
	 * Retirer la piece de la case.
	 * 
	 * @return la pièce qui était sur la case
	 */
	public Piece enleverPiece()
	{
		Piece anciennePiece = this.pieceSurlaCase;
		this.pieceSurlaCase = null;
		return anciennePiece;
	}

}
