package fr.iutvalence.java.echec;

/**
 * Application servant à jouer une partie d'échec
 */
public class LanceurDEchecs
{

	/**
	 * Entrée application
	 * @param args inutile ici
	 */
	
	public static void main(String[] args)
	{
		Joueur joueurBlanc = new JoueurClavier(Couleur.BLANC);
		Joueur joueurNoir = new JoueurClavier(Couleur.NOIR);	
		
		PartieDEchecs partieDEchec = new PartieDEchecs(joueurBlanc, joueurNoir, new AffichageGraphique());
		
		partieDEchec.jouerUnePartieDEchec();


	}

}
