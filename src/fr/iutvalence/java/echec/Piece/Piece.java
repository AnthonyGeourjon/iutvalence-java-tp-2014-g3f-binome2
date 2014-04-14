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

	/**
	 * Echiquier d'une piece
	 */
	@SuppressWarnings("unused")
	private Echiquier echiquier;

	/**
	 * @param couleur
	 *            couleur de la piece
	 * @param echiquier
	 *            echiquier associé à la piece
	 */
	public Piece(Couleur couleur, Echiquier echiquier)
	{
		this.couleur = couleur;
		this.echiquier = echiquier;
	}

	/**
	 * @return la couleur de la piece
	 */
	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}

	/**
	 * @param positionDepart position initiale de la piece
	 * @param positionDestination position désiré de la piece
	 * @return vrai si le deplacement est possible
	 */
	public abstract boolean verifierDeplacement(Position positionDepart, Position positionDestination);

}
