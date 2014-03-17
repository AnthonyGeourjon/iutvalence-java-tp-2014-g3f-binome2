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

	// TODO écrire un commentaire
	private String nomDujoueur;

	// TODO il faut plutot voir cette méthode comme un moyen de connaitre le
	// choix de déplacement
	// du joueur. Le joueur ne manipule pas l'échiquier.
	/**
	 * Le joueur joue: Deplace une piece.
	 */
	public void deplacerPiece(Echiquier echiquierSurLequelOnjoue)
	{
		int choixPiece;
		Scanner sc = new Scanner(System.in);

		System.out.println(echiquierSurLequelOnjoue);
		choixPiece = sc.nextInt(); // gerer si le nombre n'est pas correcte
	}

	// TODO écrire un commentaire
	public String toString()
	{
		return nomDujoueur;
	}

}
