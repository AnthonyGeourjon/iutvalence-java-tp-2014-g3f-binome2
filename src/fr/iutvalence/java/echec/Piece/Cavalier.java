package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Echiquier;
import fr.iutvalence.java.echec.Position;

/**
 * @author geourjoa
 * Cavalier d'une partie d'echec
 */
public class Cavalier extends Piece
{

	/**
	 * 
	 * Cree un pion de cavalier
	 * 
	 * @param couleur
	 *            couleur du cavalier
	 */
	public Cavalier(Couleur couleur,  Echiquier echiquier)
	{
		super(couleur, echiquier);
	}

	@Override
	public String toString()
	{
		return "C" + this.obtenirCouleur().toString();
	}

	public boolean verifierDeplacement(Position positionDepart, Position positionDestination)
	{
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()+1))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()+2)))
						return true;
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()-1))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()+2)))
						return true;
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()+1))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()-2)))
						return true;	
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()-1))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()-2)))
						return true;
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()+2))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()+1)))
						return true;
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()+2))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()-1)))
						return true;
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()-2))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()+1)))
						return true;	
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()-2))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()-1)))
						return true;
		return false;
		

	}

}
