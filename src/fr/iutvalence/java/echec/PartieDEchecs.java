package fr.iutvalence.java.echec;

public class PartieDEchecs
{
	private Joueur joueurBlanc;

	private Joueur joueurNoir;

	private Piece[][] pieces;

	public PartieDEchecs()
	{
		this.joueurBlanc = new Joueur();
		this.joueurNoir = new Joueur();
		this.pieces = new Piece[8][8];

	}

	public void jouerUnePartieDEchec(Joueur joueurBlanc, Joueur joueurNoir)
	{
		Position choixJoueur = joueurBlanc.demanderCoordonneeDeLaPieceAJouer();

		this.pieces[choixJoueur.getCoordonneeVerticale()][choixJoueur.getCoordonneeHorizontale()].deplacer(joueurBlanc
				.demanderCoordonneeDeDestinationDeLaPieceJouee()); 
		choixJoueur = joueurBlanc.demanderCoordonneeDeLaPieceAJouer();

		this.pieces[choixJoueur.getCoordonneeVerticale()][choixJoueur.getCoordonneeHorizontale()].deplacer(joueurBlanc
				.demanderCoordonneeDeDestinationDeLaPieceJouee()); 


	}
}
