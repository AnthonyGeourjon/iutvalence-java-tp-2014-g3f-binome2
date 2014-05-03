package fr.iutvalence.java.echec;

/**
 * Couleur que peuvent prendre des joueurs et des pieces d'echecs
 * @author geourjoa
 * 
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
