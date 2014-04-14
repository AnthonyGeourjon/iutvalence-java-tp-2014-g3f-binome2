package fr.iutvalence.java.echec;

/**
 * @author geourjoa represente une partie d'echec
 */
public class PartieDEchecs
{

	/**
	 * Joueur blanc d'echec
	 */
	private Joueur joueurBlanc;

	/**
	 * Joueur noir d'echec
	 */
	private Joueur joueurNoir;

	/**
	 * SupportDuJeu
	 */
	private Echiquier echiquierDeJeu;

	/**
	 * numero de tour de jeu
	 */
	private int numeroTour;

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs()
	{

		this.echiquierDeJeu = new Echiquier();
		this.joueurBlanc = new Joueur(Couleur.BLANC);
		this.joueurNoir = new Joueur(Couleur.NOIR);
	}

	/**
	 * Jouer une partie d echec.
	 */
	public void jouerUnePartieDEchec()
	{

		Position positionDepart, positionDestination;

		while (true)
		{
			System.out.println(this.toString());

			do
			{
				System.out.println("Saisissez la case de depart puis d'arrivée.");
				positionDepart = this.joueurBlanc.demanderPosition();
				positionDestination = this.joueurBlanc.demanderPosition();

			}
			while (!this.echiquierDeJeu.verifierMouvement(positionDepart, positionDestination, Couleur.BLANC));

			this.echiquierDeJeu.deplacerPiece(this.echiquierDeJeu.obtenirCase(positionDepart),
					this.echiquierDeJeu.obtenirCase(positionDestination));

			System.out.println(this.toString());

			do
			{
				System.out.println("Saisissez la case de depart puis d'arrivée.");
				positionDepart = this.joueurNoir.demanderPosition();
				positionDestination = this.joueurNoir.demanderPosition();

			}
			while (!this.echiquierDeJeu.verifierMouvement(positionDepart, positionDestination, Couleur.NOIR));

			this.echiquierDeJeu.deplacerPiece(this.echiquierDeJeu.obtenirCase(positionDepart),
					this.echiquierDeJeu.obtenirCase(positionDestination));

		}

	}

	public String toString()
	{

		return ("Tour numéro : " + this.numeroTour + "\n\n" + this.echiquierDeJeu.toString() + "\n\n");

	}

}
