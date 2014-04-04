package fr.iutvalence.java.echec;

import java.util.Scanner;

/**
 * Represente un joueur d'echec.
 */
public class Joueur {

	/**
	 * Couleur du jouer. Aux echecs noirs ou blanc
	 */
	private Couleur couleurDuJoueur;

	
	/**
	 * Construit un joueur
	 * @param couleurDuJoueur couleur du joueur qui sera crée 
	 */
	public Joueur(Couleur couleurDuJoueur)
	{
		this.couleurDuJoueur=couleurDuJoueur;
	}
	
	/**
	 * Obtenir la couleur du joueur 
	 * @return la couleur du joueur 
	 */
	public Couleur getCouleurDuJoueur()
	{
		return this.couleurDuJoueur;
	}
	
	public Position demanderPosition()
	{
		int choixVertical, choixHorizontal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez la coordonnée vertical");
		choixVertical=sc.nextInt();
		System.out.println("Saisissez la coordonnée horizontal");
		choixHorizontal=sc.nextInt();
		
		return new Position(choixHorizontal, choixVertical);
		
		
	}
	


	

	
}
