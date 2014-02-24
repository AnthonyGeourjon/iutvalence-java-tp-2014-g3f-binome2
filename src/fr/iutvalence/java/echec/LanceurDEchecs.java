package fr.iutvalence.java.echec;


/**
 * Application servant à jouer une partie d'échec
 */
public class LanceurDEchecs
{
	/**
	 * Points d'entrée de l'application f:
	 * @param args inutile ici.
	 */
	public static void main(String[] args)
	{
		System.out.println("Création d'une partie d'échec");
		PartieDEchecs partieDEchec = new PartieDEchecs();
		System.out.println("Démarrage d'une partie");
		partieDEchec.jouer();
		System.out.println("Fin de la partie.");

	}

}
