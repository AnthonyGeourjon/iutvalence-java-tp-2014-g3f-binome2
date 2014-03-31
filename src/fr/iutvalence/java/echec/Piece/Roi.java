package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;

public class Roi extends Piece
{

	/**
	 * 
	 * Cree un roi de couleur
	 * 
	 * @param couleur
	 *            couleur du roi
	 */
	public Roi(Couleur couleur)
	{
		super(couleur);
	}

	@Override
	public String toString()
	{
		return "R" + this.obtenirCouleur().toString();
	}

}
