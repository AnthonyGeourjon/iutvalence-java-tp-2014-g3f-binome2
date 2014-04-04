package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Position;

/**
 * La classe Piece.
 */
public abstract class Piece
{

	/**
	 * Couleur de la pièce
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

	public abstract boolean verifierDeplacement(Position positionDepart, Position positionDestination);

}
