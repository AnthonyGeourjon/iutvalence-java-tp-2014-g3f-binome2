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
	 * Le joueur joue: Deplace une piece.
	 */

	public void jouerCoup()
	{
		
	}

	/**
	 * @return la position e où le joueur veut deplacer sa pièce
	 */
	public int demanderCoordonnee() throws PositionNonValideException
	{
		Scanner sc = new Scanner(System.in);

		return sc.nextInt();
	}

}
