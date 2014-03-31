package fr.iutvalence.java.echec;

/**
 * @author geourjoa
 * Cavalier d'echec
 */
public class Cavalier extends Piece
{

	/**
	 * @param joueurproprietaire joueur possedant la piece
	 * Construire un cavalier d'echec
	 */
	public Cavalier(Joueur joueurproprietaire)
	{
		super(joueurproprietaire);
		if(super.proprietaire.getCouleurDuJoueur()==Couleur.Blanc)
			super.representationTextuelle="C";
		else
			super.representationTextuelle="c";
	}

}
