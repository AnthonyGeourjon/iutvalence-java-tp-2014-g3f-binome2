package fr.iutvalence.java.echec;


// TODO corriger les accents (il fallait changer l'encodage de texte avant)
// TODO corriger le commentaire 
/**
 * The Class LanceurDEchecs.
 * Application de jeu d'�chec
 */
public class LanceurDEchecs
{
	// TODO corriger le commentaire 
	/**
	 * The main method.
	 * Cette application execute une partie d'�chec.
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		// TODO corriger les accents 
		System.out.println("Cr�ation d'une partie d'�chec");
		Echec partieDEchec = new Echec();
		System.out.println("D�marrage de la partie d'�chec");
		partieDEchec.jouer();
		System.out.println("Fin de la partie.");

	}

}
