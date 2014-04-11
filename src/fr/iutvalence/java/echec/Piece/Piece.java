package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Echiquier;
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
	
	private Echiquier echiquier;

	public Piece(Couleur couleur, Echiquier echiquier)
	{
		this.couleur = couleur;
		this.echiquier=echiquier;
	}

	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}

	public abstract boolean verifierDeplacement(Position positionDepart, Position positionDestination);

}
