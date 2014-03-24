package fr.iutvalence.java.echec;

public class Position
{
	
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
	public Position(int nouvelleCoordonneVerticale, int nouvelleCoordonneHorizontale)
	{
		this.coordonneVerticale = nouvelleCoordonneVerticale;
		this.coordonneeHorizontale = nouvelleCoordonneHorizontale;
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

}
