package fr.iutvalence.java.echec;

// TODO: Auto-generated Javadoc
/**
 * The Class Echec. Est une partie d'�chec
 */
public class Echec
{

	/** Le compteur de tour. */
	public int compteurDeTour;

	/** Le joueur noire. */
	public final Joueur joueurNoire;

	/** Le joueur blanc. */
	public final Joueur joueurBlanc;

	/** L'echiquier de la partie. */
	public echiquier echiquierDeLaPartie;

	/**
	 * Instancie une nouvel partie d'echec.
	 */
	public Echec()
	{
		this.compteurDeTour = 0;
		this.joueurBlanc = new Joueur();
		this.joueurNoire = new Joueur();
		this.echiquierDeLaPartie = new echiquier();
	}

	/**
	 * Jouer. Simule une partie de jeu d'�chec
	 * Fin represente la condition d'une fin de partie
	 * On incr�mente le compteur de coups
	 */
	public void jouer()
	{
		boolean fin = false;

		while (!fin)
		{
			joueurBlanc.jouerCoup();
			joueurNoire.jouerCoup();
			compteurDeTour++;
		}

	}

}
