package fr.iutvalence.java.echec;

/**
 * La classe Piece.
 */
public abstract class Piece
{

	/**
	 *  Couleur de la pièce
	 */
	private final Couleur couleur;

	
	public Piece(Couleur couleur)
	{
		this.couleur = couleur;
	}
	
	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}

	
}
