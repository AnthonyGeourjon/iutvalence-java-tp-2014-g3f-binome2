package fr.iutvalence.java.echec;

/**
 * Represente une partie d'échec
 * Au début, le joueur noir et blanc possèdent 16 pièces 
 */
public class PartieDEchecs
{

	/** Le compteur de tour. */
	public int compteurDeTours;

	/** Le joueur noir. */
	public final Joueur joueurNoir;

	/** Le joueur blanc. */
	public final Joueur joueurBlanc;

	/** L'echiquier de la partie. */
	public Echiquier echiquier;

	/**
	 * Instancie une nouvel partie d'echec.
	 */
	public PartieDEchecs()
	{
		this.compteurDeTours = 0;
		this.joueurBlanc = new Joueur();
		this.joueurNoir = new Joueur();
		this.echiquier = new Echiquier();
	}

	/**
	 * Deroulement d'une partie d'échec
	 */
	public void jouer()
	{
		boolean fin = false;

		while (!fin)
		{
			this.joueurBlanc.jouerCoup();
			this.joueurNoir.jouerCoup();
			this.compteurDeTours++;
		}
	}
}


