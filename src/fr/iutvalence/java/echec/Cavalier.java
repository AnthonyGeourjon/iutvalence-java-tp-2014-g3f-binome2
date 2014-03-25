package fr.iutvalence.java.echec;

public class Cavalier extends Piece
{

	public Cavalier(Joueur joueurproprietaire)
	{
		super(joueurproprietaire);
		if(super.proprietaire.getCouleurDuJoueur()==Couleur.Blanc)
			super.representationTextuelle="C";
		else
			super.representationTextuelle="c";
	}

}
