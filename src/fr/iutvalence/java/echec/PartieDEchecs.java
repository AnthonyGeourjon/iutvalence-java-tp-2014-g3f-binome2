package fr.iutvalence.java.echec;

public class PartieDEchecs
{
	
	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	/** Le joueur noir. */
	private Joueur joueurNoir;
	
	private Echiquier echiquierDeJeu;

	

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs()
	{
		this.joueurBlanc = new Joueur(Couleur.Blanc);
		this.joueurNoir = new Joueur(Couleur.Noire);
		this.echiquierDeJeu = new Echiquier(this.joueurBlanc, this.joueurNoir);
	}

	/**
	 * Jouer une partie d echec. Le joueur blanc deplace une piece puis le joueur noire fait de meme.
	 *
	 * @param joueurBlanc le joueur blanc
	 * @param joueurNoir le joueur noir
	 */
	public void jouerUnePartieDEchec()
	{
		System.out.println(this.echiquierDeJeu.toString());
		
		
		

		
	


	}
	
	
}
