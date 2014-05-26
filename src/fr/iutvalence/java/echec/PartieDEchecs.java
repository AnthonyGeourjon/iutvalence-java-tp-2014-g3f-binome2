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
	 * L'affichage
	 */
	private Affichage affichage;

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs(Joueur joueurBlanc, Joueur joueurNoir, Affichage affichage)
	{
		this.echiquier = new Echiquier();
		this.joueurBlanc = joueurBlanc;
		this.joueurNoir = joueurNoir;
		this.affichage = affichage;
	}

	/**
	 * Jouer une partie d echec.
	 */
	public void jouerUnePartieDEchec()
	{

		Position positionDepart, positionDestination;

		while (true)
		{
			this.affichage.afficherTour(this.numeroTour, this.echiquier);

			do
			{
				this.affichage.afficherDemandeDeCaseDepart();
				positionDepart = this.joueurBlanc.demanderPosition();
				
				this.affichage.afficherDemandeDeCaseDArrivee();
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

			this.affichage.afficherTour(numeroTour, echiquier);

			do
			{
				this.affichage.afficherDemandeDeCaseDepart();
				positionDepart = this.joueurNoir.demanderPosition();
				this.affichage.afficherDemandeDeCaseDArrivee();
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

}
