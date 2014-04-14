package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Echiquier;
import fr.iutvalence.java.echec.Position;

/**
 * @author geourjoa
 * Fou d'une partie d'echec
 */
public class Fou extends Piece
{

	/**
	 * 
	 * Cree un fou de couleur
	 * 
	 * @param couleur
	 *            couleur du fou
	 */
	public Fou(Couleur couleur, Echiquier echiquier)
	{
		super(couleur, echiquier);
	}

	@Override
	public String toString()
	{
		return "F" + this.obtenirCouleur().toString();
	}

	@Override
	public boolean verifierDeplacement(Position positionDepart, Position positionDestination)
	{
		return true;
	}

}
