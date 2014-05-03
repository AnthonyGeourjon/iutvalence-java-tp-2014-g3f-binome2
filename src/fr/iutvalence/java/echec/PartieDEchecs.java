package fr.iutvalence.java.echec;

import fr.iutvalence.java.echec.Exception.PiecedeMemeCouleurException;

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
	 * Echiquier
	 */
	private Echiquier echiquier;

	/**
	 * numero de tour de jeu
	 */
	private int numeroTour;

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs(Joueur joueurBlanc, Joueur joueurNoir)
	{
		this.echiquier = new Echiquier();
		this.joueurBlanc = joueurBlanc;
		this.joueurNoir = joueurNoir;
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
				System.out
						.println("Saisissez la case de depart puis d'arrivée.");
				positionDepart = this.joueurBlanc.demanderPosition();
				positionDestination = this.joueurBlanc.demanderPosition();

			}
			while (!this.echiquier.verifierMouvement(positionDepart,
					positionDestination, Couleur.BLANC));

			try
			{
				this.echiquier.deplacerPiece(
						this.echiquier.obtenirCase(positionDepart),
						this.echiquier.obtenirCase(positionDestination));
			}
			catch (PiecedeMemeCouleurException e)
			{
				// TODO exception à traiter !
			}

			System.out.println(this.toString());

			do
			{
				System.out
						.println("Saisissez la case de depart puis d'arrivée.");
				positionDepart = this.joueurNoir.demanderPosition();
				positionDestination = this.joueurNoir.demanderPosition();

			}
			while (!this.echiquier.verifierMouvement(positionDepart,
					positionDestination, Couleur.NOIR));

			try
			{
				this.echiquier.deplacerPiece(
						this.echiquier.obtenirCase(positionDepart),
						this.echiquier.obtenirCase(positionDestination));
			}
			catch (PiecedeMemeCouleurException e)
			{
				// TODO exception à traiter
			}
		}
	}

	public String toString()
	{

		return ("Tour numéro : " + this.numeroTour + "\n\n"
				+ this.echiquier.toString() + "\n\n");

	}

}
