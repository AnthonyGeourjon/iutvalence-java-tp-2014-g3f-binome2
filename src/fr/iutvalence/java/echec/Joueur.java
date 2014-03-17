package fr.iutvalence.java.echec;

import java.util.Scanner;

public class Joueur
{

	private Position demanderPositionAuJoueur()
	{
		// TODO demander à l'utilisateur de saisir les coordonnée de la piece et verifier si la piece lui appartient 
		
		Scanner sc = new Scanner(System.in);
		int choixVertical, choixHorizontale;
		
		System.out.println("Saisissez la coordonné verticale :");
		choixVertical=sc.nextInt();
		System.out.println("Saisissez la coordonné horizontale:");
		choixHorizontale=sc.nextInt();
		
		return new Position(choixVertical, choixHorizontale);
		
	}
	
	public Position demanderCoordonneeDeLaPieceAJouer()
	{
		return demanderPositionAuJoueur();
	}
	
	public Position demanderCoordonneeDeDestinationDeLaPieceJouee()
	{
		return demanderPositionAuJoueur();
	}
	
}
