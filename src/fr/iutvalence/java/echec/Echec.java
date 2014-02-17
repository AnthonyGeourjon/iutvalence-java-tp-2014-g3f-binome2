package fr.iutvalence.java.echec;

// TODO: Auto-generated Javadoc
/**
 * The Class Echec. Est une partie d'échec
 */
public class Echec
{

	/** Le compteur de tour. */
	public int compteurDeTour ;
	
	/** Le joueur noire. */
	public Joueur joueurNoire;
	
	/** Le joueur blanc. */
	public Joueur joueurBlanc;
	
	/** L'echiquier de la partie. */
	public echiquier echiquierDeLaPartie;
	
	/**
	 * Instancie une nouvel partie d'echec.
	 */
	public Echec()
	{
		this.compteurDeTour=0;
		this.joueurBlanc=new Joueur();
		this.joueurNoire=new Joueur();
	}
	
	/**
	 * Jouer. Simule une partie de jeu d'échec
	 */
	public void jouer()
	{
		// TODO Auto-generated method stub

	}

}
