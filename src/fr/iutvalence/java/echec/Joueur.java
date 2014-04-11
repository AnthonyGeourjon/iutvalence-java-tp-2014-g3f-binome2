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
		String reponse = new String();
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez les coordonné (ligne, colonne) -> (chiffre, lettre).");
		reponse=sc.next();
		
		int choixVertical = (int) (reponse.charAt(0)-'0');
		
		int choixHorizontal = (int) (reponse.charAt(1)-'a'+1);
		
		System.out.println( choixHorizontal + " " +  choixVertical);
		
		return new Position(choixHorizontal-1, choixVertical-1);
		
		
	}
	


	

	
}
