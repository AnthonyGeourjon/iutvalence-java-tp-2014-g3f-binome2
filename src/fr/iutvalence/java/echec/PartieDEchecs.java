package fr.iutvalence.java.echec;

public class PartieDEchecs
{
	
	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	/** Le joueur noir. */
	private Joueur joueurNoir;

	/** Les pieces qui sont en jeu. */
	private Piece[][] pieces;

	/**
	 * Creer une partie d'echec, l'echiquier est vide
	 */
	public PartieDEchecs()
	{
		this.joueurBlanc = new Joueur();
		this.joueurNoir = new Joueur();
		this.pieces = new Piece[8][8];
		this.pieces[5][4]=new Piece(joueurBlanc, new Position(5, 4));

	}

	/**
	 * Jouer une partie d echec. Le joueur blanc deplace une piece puis le joueur noire fait de meme.
	 *
	 * @param joueurBlanc le joueur blanc
	 * @param joueurNoir le joueur noir
	 */
	public void jouerUnePartieDEchec(Joueur joueurBlanc, Joueur joueurNoir)
	{
		System.out.println(this);
		
		this.pieces[5][4].deplacer();
		
		System.out.println(this);
		
	


	}
	
	public String toString() 
	{
		String affichage = "" ;
		
		for(int coordonneVerticale = 0 ; coordonneVerticale < 8 ; coordonneVerticale++)
		{
			for(int coordonneHorizontale = 0 ; coordonneHorizontale < 8 ; coordonneHorizontale ++)
			{
				
				if  (this.pieces[coordonneVerticale][coordonneHorizontale]!=null)
					affichage+=this.pieces[coordonneVerticale][coordonneHorizontale].ObtenirRepersentationTextuelle();
				else
					affichage+=".";
			}
			affichage+="\n";
		}
		
		return affichage;
	}
}
