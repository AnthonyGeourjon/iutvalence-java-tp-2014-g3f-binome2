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
		this.joueurBlanc = new Joueur(Couleur.Blanc);
		this.joueurNoir = new Joueur(Couleur.Noire);
		this.echiquierDeJeu = new Echiquier(this.joueurBlanc, this.joueurNoir);
	}

	/**
	 * Jouer une partie d echec. Le joueur blanc deplace une piece puis le
	 * joueur noire fait de meme.
	 */
	public void jouerUnePartieDEchec()
	{
		
		
		
			System.out.println(this.echiquierDeJeu.toString());
			echiquierDeJeu.deplacerPiece(echiquierDeJeu.Cases [4][4], echiquierDeJeu.Cases[6][6]);
			System.out.println(this.echiquierDeJeu.toString());
		
		
		
		

	}

}
