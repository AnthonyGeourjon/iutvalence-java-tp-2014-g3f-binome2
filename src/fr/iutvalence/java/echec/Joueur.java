package fr.iutvalence.java.echec;

import java.util.Scanner;

/**
 * Represente un joueur d'echec.
 */
public class Joueur
{
	/**
	 * Couleur associée
	 */
	private Couleur couleur;

	/**
	 * Construit un joueur
	 * 
	 * @param couleurDuJoueur
	 *            couleur du joueur qui sera crée
	 */
	public Joueur(Couleur couleurDuJoueur)
	{
		this.couleur = couleurDuJoueur;
	}

	/**
	 * Obtenir la couleur associée
	 * 
	 * @return la couleur associée
	 */
	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}

	/**
	 * @return une position saisie au clavier par le joueur
	 */
	public Position demanderPosition()
	{
		String reponse = new String();

		Scanner sc = new Scanner(System.in);

		System.out.println("Saisissez les coordonné (ligne, colonne) -> (chiffre, lettre).");
		reponse = sc.next();

		int numeroDeLigne = (int) (reponse.charAt(0) - '0');

		int numeroDeColonne = (int) (reponse.charAt(1) - 'a' + 1);

		return new Position(numeroDeLigne - 1, numeroDeColonne - 1);

	}

}
