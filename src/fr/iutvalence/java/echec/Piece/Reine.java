package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Echiquier;
import fr.iutvalence.java.echec.Position;

/**
 * @author geourjoa Reine de jeu d'echec
 */
public class Reine extends Piece
{

	/**
	 * 
	 * Cree une reine de couleur
	 * 
	 * @param couleur
	 *            couleur de la reine
	 * @param echiquier
	 *            echiquier associé à la piece
	 */
	public Reine(Couleur couleur, Echiquier echiquier)
	{
		super(couleur, echiquier);
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
