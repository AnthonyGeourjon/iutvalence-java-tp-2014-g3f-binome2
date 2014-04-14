package fr.iutvalence.java.echec.Piece;

import fr.iutvalence.java.echec.Couleur;
import fr.iutvalence.java.echec.Echiquier;
import fr.iutvalence.java.echec.Position;

/**
 * @author geourjoa Roi de jeu d'echec
 */
public class Roi extends Piece
{

	/**
	 * 
	 * Cree un roi de couleur
	 * 
	 * @param couleur
	 *            couleur du roi
	 * @param echiquier
	 *            echiquier associé à la piece
	 */
	public Roi(Couleur couleur, Echiquier echiquier)
	{
		super(couleur, echiquier);
	}

	@Override
	public String toString()
	{
		return "R" + this.obtenirCouleur().toString();
	}

	@Override
	public boolean verifierDeplacement(Position positionDepart, Position positionArrivee)
	{
		int pdc = positionDepart.obtenirNumeroDeColonne(), pdl = positionDepart.obtenirNumeroDeLigne(), pac = positionArrivee
				.obtenirNumeroDeColonne(), pal = positionArrivee.obtenirNumeroDeLigne();

		if (pdc==pac&&pdl==pal)
			return false;
		if ((Math.abs(pdc-pac)<2)&&(Math.abs(pdl-pal)<2))
				return true;
		return false;
		
	}

}
