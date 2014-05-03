package fr.iutvalence.java.echec;

/**
 * Implementation abstraite de joueur
 * @author sebastienjean
 * 
 *
 */
public abstract class JoueurAbstrait implements Joueur
{

	/**
	 * Couleur associée
	 */
	protected Couleur couleur;

	/**
	 * Création d'un nouveau joueur, de couleur donnée
	 * @param couleur la couleur
	 */
	public JoueurAbstrait(Couleur couleur)
	{
		this.couleur = couleur;
	}

	/**
	 * Obtenir la couleur associée
	 * 
	 * @return la couleur associée
	 */
	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}

}