package fr.iutvalence.java.echec;

/**
 * @author geourjoa represente une partie d'echec
 */
public class PartieDEchecs
{

	/**
	 * SupportDuJeu
	 */
	private Echiquier echiquierDeJeu;

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs()
	{

		this.echiquierDeJeu = new Echiquier();
	}

	/**
	 * Jouer une partie d echec. Le joueur blanc deplace une piece puis le
	 * joueur noire fait de meme.
	 */
	public void jouerUnePartieDEchec()
	{

		System.out.println(this.echiquierDeJeu.toString());

		echiquierDeJeu.deplacerPiece(echiquierDeJeu.obtenirCase(6, 6), echiquierDeJeu.obtenirCase(5, 5));

		System.out.println(this.echiquierDeJeu.toString());

	}

}
