package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Position;

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

	@Override
	public boolean verifierDeplacement(Position positionDepart, Position positionDestination)
	{
		// TODO Auto-generated method stub
		return true;
	}

}
