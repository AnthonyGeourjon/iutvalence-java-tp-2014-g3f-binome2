package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Position;

public class Tour extends Piece
{

	/**
	 * 
	 * Cree une tour de couleur
	 * 
	 * @param couleur
	 *            couleur de la pour 
	 */
	public Tour(Couleur couleur)
	{
		super(couleur);
	}

	@Override
	public String toString()
	{
		return "T" + this.obtenirCouleur().toString();
	}

	@Override
    public
    boolean verifierDeplacement(Position positionDepart, Position positionDestination)
    {
	    // TODO Auto-generated method stub
	    return true;
    }

}
