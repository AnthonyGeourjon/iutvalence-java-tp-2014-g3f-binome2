package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;

public class Tour extends Piece
{

	/**
	 * 
	 * Cree une tour de couleur
	 * 
	 * @param couleur
	 *            couleur de la pour 
	 */
	public Tour(Couleur couleur)
	{
		super(couleur);
	}

	@Override
	public String toString()
	{
		return "T" + this.obtenirCouleur().toString();
	}

}
