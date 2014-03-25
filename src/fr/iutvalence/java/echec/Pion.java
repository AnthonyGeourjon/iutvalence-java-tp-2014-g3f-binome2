package fr.iutvalence.java.echec;

public class Pion extends Piece
{

	public Pion(Joueur joueurproprietaire)
	{
		super(joueurproprietaire);
		if(super.proprietaire.getCouleurDuJoueur()==Couleur.Blanc)
			super.representationTextuelle="P";
		else
			super.representationTextuelle="p";
	}

}
