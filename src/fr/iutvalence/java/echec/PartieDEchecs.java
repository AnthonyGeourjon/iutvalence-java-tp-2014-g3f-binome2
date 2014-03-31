package fr.iutvalence.java.echec;

/**
 * @author geourjoa represente une partie d'echec
 */
public class PartieDEchecs
{

	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	/** Le joueur noir. */
	private Joueur joueurNoir;

	/**
	 * SupportDuJeu
	 */
	private Echiquier echiquierDeJeu;

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs()
	{
		this.joueurBlanc = new Joueur(Couleur.BLANC);
		this.joueurNoir = new Joueur(Couleur.NOIR);
		this.echiquierDeJeu = new Echiquier();
	}

	/**
	 * Jouer une partie d echec. Le joueur blanc deplace une piece puis le
	 * joueur noire fait de meme.
	 */
	public void jouerUnePartieDEchec()
	{
		
		
		
			System.out.println(this.echiquierDeJeu.toString());
			
			echiquierDeJeu.deplacerPiece(echiquierDeJeu.obtenirCase(6,6), echiquierDeJeu.obtenirCase(5,5));
			
			System.out.println(this.echiquierDeJeu.toString());
			
		
		
		

	}

}
