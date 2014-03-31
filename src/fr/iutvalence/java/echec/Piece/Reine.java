package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;

public class Reine extends Piece
{

	/**
	 * 
	 * Cree une reine de couleur
	 * 
	 * @param couleur
	 *            couleur de la reine
	 */
	public Reine(Couleur couleur)
	{
		super(couleur);
	}

	@Override
	public String toString()
	{
		return "r" + this.obtenirCouleur().toString();
	}

}
