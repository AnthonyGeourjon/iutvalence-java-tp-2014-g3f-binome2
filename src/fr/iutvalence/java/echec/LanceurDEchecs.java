package fr.iutvalence.java.echec;

/**
 * Application servant à jouer une partie d'échec
 */
public class LanceurDEchecs
{

	// TODO écrire un commentaire
	public static void main(String[] args)
	{
		System.out.println("Création d'une partie d'échec");
		PartieDEchecs partieDEchec = new PartieDEchecs();
		System.out.println("Démarrage d'une partie");
		partieDEchec.jouer(partieDEchec.echiquier);
		System.out.println("Fin de la partie.");

	}

}
