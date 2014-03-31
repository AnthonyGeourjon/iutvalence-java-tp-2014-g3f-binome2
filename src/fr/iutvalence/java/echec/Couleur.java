package fr.iutvalence.java.echec;

public enum Couleur
{
	
	/**
	 * La couleur blanche
	 */
	BLANC,
	
	/**
	 * La couleur noire
	 */
	NOIR;

	@Override
	public String toString() 
	{
	if (this == BLANC) return "b";
	return "n";
	}
}
