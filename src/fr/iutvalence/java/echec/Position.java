package fr.iutvalence.java.echec;

public class Position
{
	private int coordonneVerticale;

	private int coordonneeHorizontale;

	public Position(int nouvelleCoordonneVerticale, int nouvelleCoordonneHorizontale)
	{
		this.coordonneVerticale = nouvelleCoordonneVerticale;
		this.coordonneeHorizontale = nouvelleCoordonneHorizontale;
	}

	public int getCoordonneeVerticale()
	{
		return coordonneVerticale;
	}

	public int getCoordonneeHorizontale()
	{
		return coordonneeHorizontale;
	}

}
