package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Position;

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

	@Override
    public boolean verifierDeplacement(Position positionDepart, Position positionDestination)
    {
	    // TODO Auto-generated method stub
	    return true;
    }

}
