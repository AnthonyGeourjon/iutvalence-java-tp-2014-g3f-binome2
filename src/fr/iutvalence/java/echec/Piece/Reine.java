package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Position;

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

	@Override
	public boolean verifierDeplacement(Position positionDepart, Position positionDestination)
	{
		// TODO Auto-generated method stub
		return true;
	}

}
