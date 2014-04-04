package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Position;

public class Pion extends Piece
{

	/**
	 * 
	 * Cree un pion de couleur
	 * 
	 * @param couleur
	 *            couleur du pion
	 */
	public Pion(Couleur couleur)
	{
		super(couleur);
	}

	@Override
	public String toString()
	{
		return "P" + this.obtenirCouleur().toString();
	}

	@Override
	public boolean verifierDeplacement(Position positionDepart, Position positionDestination)
	{
		// TODO Auto-generated method stub
		return true;
	}

}
