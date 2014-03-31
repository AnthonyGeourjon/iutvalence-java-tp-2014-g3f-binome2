package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;

public class Fou extends Piece
{

	/**
	 * 
	 * Cree un fou de couleur
	 * 
	 * @param couleur
	 *            couleur du fou
	 */
	public Fou(Couleur couleur)
	{
		super(couleur);
	}

	@Override
	public String toString()
	{
		return "F" + this.obtenirCouleur().toString();
	}

}
