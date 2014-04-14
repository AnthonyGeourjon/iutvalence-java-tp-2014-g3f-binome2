package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Echiquier;
import fr.iutvalence.java.echec.Position;

/**
 * @author geourjoa
 * Pion d'une partie d'echec
 */
public class Pion extends Piece
{

	/**
	 * 
	 * Cree un pion de couleur
	 * 
	 * @param couleur
	 *            couleur du pion
	 * @param echiquier echiquier sur lequel le pion est.
	 */
	public Pion(Couleur couleur, Echiquier echiquier)
	{
		super(couleur, echiquier);
	}

	@Override
	public String toString()
	{
		return "P" + this.obtenirCouleur().toString();
	}

	@Override
	public boolean verifierDeplacement(Position positionDepart, Position positionDestination)
	{
		
		
		
		if((positionDepart.obtenirNumeroDeColonne()==positionDestination.obtenirNumeroDeColonne())
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()+1)))
						return true;
		
		
		return false;
	}

}
