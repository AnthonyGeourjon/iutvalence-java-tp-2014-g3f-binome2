package fr.iutvalence.java.echec;

/**
 * Représente une position, à l'intersection d'une ligne et d'une colonne
 * 
 * @author sebastienjean
 */
public class Position {
	/**
	 * Numéro de ligne
	 */
	private final int numeroDeLigne;

	/**
	 * Numéro de colonne
	 */
	private final int numeroDeColonne;

	/**
	 * Construit une nouvelle position, à la position ligne/colonne en
	 * parametres
	 * 
	 * @param numeroDeLigne
	 *            ligne
	 * 
	 * @param numeroDeColonne
	 *            colonne
	 */
	public Position(int numeroDeLigne, int numeroDeColonne) {
		this.numeroDeLigne = numeroDeLigne;
		this.numeroDeColonne = numeroDeColonne;
	}

	/**
	 * 
	 * @return le numéro de ligne
	 */
	public int obtenirNumeroDeLigne() {
		return this.numeroDeLigne;
	}

	/**
	 * @return le numéro de colonne
	 */
	public int obtenirNumeroDeColonne() {
		return this.numeroDeColonne;
	}

	@Override
	public String toString() {
		return "Position [numeroDeColonne=" + numeroDeColonne + 
				 ", numeroDeLigne=" + numeroDeLigne + "]";
	}
	
	
	
}