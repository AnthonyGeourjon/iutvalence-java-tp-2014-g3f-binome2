package fr.iutvalence.java.echec;

/**
 * @author geourjoa
 * Couleur que peuvent prendre des joueurs et des pieces d'echecs
 */
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
