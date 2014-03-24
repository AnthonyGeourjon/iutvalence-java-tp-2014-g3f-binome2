package fr.iutvalence.java.echec;

import java.util.Scanner;

/**
 * Represente un joueur d'echec.
 */
public class Joueur {

	/**
	 * Demander position au joueur via la console.
	 * 
	 * @return la position saisie
	 */
	private Position demanderPositionAuJoueur() {
		// TODO demander à l'utilisateur de saisir les coordonnée de la piece et
		// verifier si la piece lui appartient

		Scanner sc = new Scanner(System.in);
		int choixVertical, choixHorizontale;

		System.out.println("Saisissez la coordonné verticale :");
		choixVertical = sc.nextInt();
		System.out.println("Saisissez la coordonné horizontale:");
		choixHorizontale = sc.nextInt();

		return new Position(choixVertical, choixHorizontale);

	}

	/**
	 * Demander coordonnee de la piece a jouer.
	 * 
	 * @return la position de la piece a jouer.
	 */
	public Position demanderCoordonneeDeLaPieceAJouer() {
		return demanderPositionAuJoueur();
	}

	/**
	 * Demander coordonnee de destination de la piece jouee.
	 * 
	 * @return une position de destination
	 */
	public Position demanderCoordonneeDeDestinationDeLaPieceJouee() {
		return demanderPositionAuJoueur();
	}

}
