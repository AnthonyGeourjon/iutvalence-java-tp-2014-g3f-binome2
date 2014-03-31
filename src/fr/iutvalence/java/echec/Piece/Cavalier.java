package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;

public class Cavalier extends Piece
{

	/**
	 * 
	 * Cree un pion de cavalier
	 * 
	 * @param couleur
	 *            couleur du cavalier
	 */
	public Cavalier(Couleur couleur)
	{
		super(couleur);
	}

	@Override
	public String toString()
	{
		return "C" + this.obtenirCouleur().toString();
	}

}
