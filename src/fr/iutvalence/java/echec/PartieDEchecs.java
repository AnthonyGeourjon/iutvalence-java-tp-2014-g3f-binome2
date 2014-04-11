package fr.iutvalence.java.echec;

/**
 * @author geourjoa represente une partie d'echec
 */
public class PartieDEchecs
{

	/**
	 * Joueur blanc d'echec
	 */
	private Joueur joueurBlanc;
	
	/**
	 * Joueur noir d'echec
	 */
	private Joueur joueurNoir;
	
	/**
	 * SupportDuJeu
	 */
	private Echiquier echiquierDeJeu;

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs()
	{

		this.echiquierDeJeu = new Echiquier();
		this.joueurBlanc=new Joueur(Couleur.BLANC);
		this.joueurNoir=new Joueur(Couleur.NOIR);
	}

	/**
	 * Jouer une partie d echec. Le joueur blanc deplace une piece puis le
	 * joueur noire fait de meme.
	 * @param positionDepart 
	 * @param positionDestination 
	 */
	public void jouerUnePartieDEchec()
	{

		System.out.println(this.echiquierDeJeu.toString());

		Position positionDepart, positionDestination;
				
		do
		{
			System.out.println("Saisissez la case de depart puis d'arrivée.");
			positionDepart=this.joueurBlanc.demanderPosition();
		    positionDestination=this.joueurBlanc.demanderPosition();
			
		}while(!echiquierDeJeu.verifierMouvement(positionDepart, positionDestination));
			
		
			echiquierDeJeu.deplacerPiece(echiquierDeJeu.obtenirCase(positionDepart), echiquierDeJeu.obtenirCase(positionDestination));

			

			
			System.out.println(this.echiquierDeJeu.toString());

			
	}

}
