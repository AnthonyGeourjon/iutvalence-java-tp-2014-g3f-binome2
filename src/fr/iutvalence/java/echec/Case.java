package fr.iutvalence.java.echec;

public class Case
{
	
	
	private Piece pieceSurlaCase;
	
	/** La coordonne verticale. */
	private int coordonneVerticale;

	/** La coordonnee horizontale. */
	
	private int coordonneeHorizontale;

	/**
	 * Cree une nouvelle position.
	 *
	 * @param nouvelleCoordonneVerticale the nouvelle coordonne verticale
	 * @param nouvelleCoordonneHorizontale the nouvelle coordonne horizontale
	 */
	public Case(int nouvelleCoordonneVerticale, int nouvelleCoordonneHorizontale, Piece piecesurlaCase)
	{
		this.coordonneVerticale = nouvelleCoordonneVerticale;
		this.coordonneeHorizontale = nouvelleCoordonneHorizontale;
		this.pieceSurlaCase=piecesurlaCase;
		
	}

	/**
	 * Obtenir la coordonnee verticale.
	 *
	 * @return la coordonnee verticale
	 */
	public int getCoordonneeVerticale()
	{
		return coordonneVerticale;
	}

	/**
	 * Obtenir la coordonnee horizontale.
	 *
	 * @return la coordonnee horizontale
	 */
	public int getCoordonneeHorizontale()
	{
		return coordonneeHorizontale;
	}

	public Piece obtenirPiece()
	{
		// TODO Auto-generated method stub
		return pieceSurlaCase;
	}
	

}
