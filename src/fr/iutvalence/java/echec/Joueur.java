package fr.iutvalence.java.echec;

import java.util.Scanner;

/**
 * Represente un joueur d'echec.
 */
public class Joueur {

	private Couleur couleurDuJoueur;

	
	public Joueur(Couleur couleurDuJoueur)
	{
		this.couleurDuJoueur=couleurDuJoueur;
	}
	
	public Couleur getCouleurDuJoueur()
	{
		return couleurDuJoueur;
	}

	

	
}
