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

	private String nomDujoueur;
	
	/**
	 * Le joueur joue: Deplace une piece.
	 */
	public void deplacerPiece(Echiquier echiquierSurLequelOnjoue)
	{
		int choixPiece;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(echiquierSurLequelOnjoue);
		choixPiece=sc.nextInt(); // gerer si le nombre n'est pas correcte
		
		
		

	}
	
	public String toString()
	{
		return nomDujoueur;
	}
	

}
