package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Echiquier;
import fr.iutvalence.java.echec.Position;

/**
 * Fou d'une partie d'echec
 * @author geourjoa 
 */
public class Fou extends Piece
{

	/**
	 * 
	 * Cree un fou de couleur
	 * 
	 * @param couleur
	 *            couleur du fou
	 * @param echiquier
	 *            echiquier associé à la piece
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
		// TODO Auto-generated method stub

		return true;
	}

}
