package fr.iutvalence.java.echec;

// TODO renommer la classe Echecs
// TODO corriger le commentaire
/**
 * The Class Echec. Est une partie d'�chec
 */
public class Echec
{

	// TODO réfléchir à la pertinence de cet attribut Vs une variable locale
	/** Le compteur de tour. */
	public int compteurDeTours;

	/** Le joueur noire. */
	public final Joueur joueurNoir;

	/** Le joueur blanc. */
	public final Joueur joueurBlanc;

	/** L'echiquier de la partie. */
	public Echiquier echiquier;

	/**
	 * Instancie une nouvel partie d'echec.
	 */
	public Echec()
	{
		this.compteurDeTours = 0;
		this.joueurBlanc = new Joueur();
		this.joueurNoir = new Joueur();
		this.echiquier = new Echiquier();
	}

	// TODO corriger le commentaire
	// TODO écrire le commentaire de façon plus précise, sans parler de son implementation
	/**
	 * Jouer. Simule une partie de jeu d'�chec Fin represente la condition d'une
	 * fin de partie On incr�mente le compteur de coups
	 */
	public void jouer()
	{
		boolean fin = false;

		while (!fin)
		{
			joueurBlanc.jouerCoup();
			joueurNoir.jouerCoup();
			compteurDeTours++;
		}

	}

}
