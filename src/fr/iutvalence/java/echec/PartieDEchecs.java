package fr.iutvalence.java.echec;

public class PartieDEchecs
{
	
	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	/** Le joueur noir. */
	private Joueur joueurNoir;

	/** Les pieces qui sont en jeu. */
	private Piece[][] pieces;

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs()
	{
		this.joueurBlanc = new Joueur();
		this.joueurNoir = new Joueur();
		this.pieces = new Piece[8][8];

	}

	/**
	 * Jouer une partie d echec. Le joueur blanc deplace une piece puis le joueur noire fait de meme.
	 *
	 * @param joueurBlanc le joueur blanc
	 * @param joueurNoir le joueur noir
	 */
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
