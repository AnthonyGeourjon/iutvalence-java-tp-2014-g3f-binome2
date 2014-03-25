package fr.iutvalence.java.echec;

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

	

	
}
