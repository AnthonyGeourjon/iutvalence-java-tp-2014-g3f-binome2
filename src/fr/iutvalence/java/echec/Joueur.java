package fr.iutvalence.java.echec;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 *  Un joueur d'echec, est une personne possédant des pieces sur un échiquier, 
 *  elle peut les déplacer et "prendre" les pièces d'un autre joueur (sous certaines conditions). 
 *  
 */
public class Joueur
{

	/** Pieces du joueur. */
	private Piece[] piecesDuJoueur;
	
	
	/**
	 * Le joueur joue:
	 * Deplace une piece.
	 */

	public void jouerCoup() 
	{
		int pieceADeplacer = 1, x=4, y=5; // x et y seront des coordonné a demander a l'utilisateur
		
		try
		{
			this.piecesDuJoueur[pieceADeplacer].deplacer(new Position(x, y));
		}
		catch (positionNonValide)
		{
			while()
		}
		
	}

	
	
	

	

}
