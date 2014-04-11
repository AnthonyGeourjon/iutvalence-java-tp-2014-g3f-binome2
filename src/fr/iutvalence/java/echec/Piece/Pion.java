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
		if
		
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()+1))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()+1)))
						return true;
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()-1))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()+1)))
						return true;
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()+1))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()-1)))
						return true;	
		
		if((positionDepart.obtenirNumeroDeColonne()==(positionDestination.obtenirNumeroDeColonne()-1))
				&&(positionDepart.obtenirNumeroDeLigne()==(positionDestination.obtenirNumeroDeLigne()-1)))
						return true;
		return false;
	}

}
