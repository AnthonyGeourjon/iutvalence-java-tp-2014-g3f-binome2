package fr.iutvalence.java.echec;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * Un joueur d'echec, est une personne possédant des pieces sur un échiquier,
 * elle peut les déplacer et "prendre" les pièces d'un autre joueur (sous
 * certaines conditions).
 * 
 */
public class Joueur
{

	/**
	 * Nom du joueur qui permet de l'afficher
	 */

	private String nomDujoueur;

	/**
	 * Le joueur joue: Deplace une piec
	 * @return le numéro de la pièce choisi a jouer
	 */
	public int demanderDeplacement()
	{
		int choixPiece;
		Scanner sc = new Scanner(System.in);

		choixPiece = sc.nextInt(); // gerer si le nombre n'est pas correcte

		return choixPiece;
	}

	
	public String toString()
	{
		return this.nomDujoueur;
	}

	

}
