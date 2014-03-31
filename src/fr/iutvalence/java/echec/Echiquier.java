package fr.iutvalence.java.echec;

/**
 * @author geourjoa
 * Represente la plateau de jeu 
 */
public class Echiquier
{
	/**
	 * Nombre de colonne de l'échiquier
	 */
	private static final int NOMBRE_COLONNE_ECHIQUIER = 8;
	
	/**
	 * Nombre de ligne de l'échiquier
	 */
	private static final int NOMBRE_LIGNE_ECHIQUIER = 8;
	
	/**
	 * Ensemble des cases du jeu  
	 */
	private Case[][] Cases;

	/**
	 * Cree un nouvel echiquier, contenant des pieces de deux joueurs differents
	 * 
	 * @param joueurBlanc un joueur qui a des pieces sur l'échiquier.
	 * @param joueurNoir l'autre joueur.
	 */
	public Echiquier(Joueur joueurBlanc, Joueur joueurNoir)
	{
		this.Cases=new Case[8][8];

		placerPieceSurLEchiquier(joueurBlanc, joueurNoir);
	}

	/**
	 * Factorisation du code du constructeur ! 
	 * @param joueurBlanc idem que Echiquier()
	 * @param joueurNoir idem
	 */

	private void placerPieceSurLEchiquier(Joueur joueurBlanc, Joueur joueurNoir)
	{
		for (int coordonneVerticale = 0; coordonneVerticale < 8; coordonneVerticale++)
		{
			for (int coordonneHorizontale = 0; coordonneHorizontale < 8; coordonneHorizontale++)
				this.Cases[coordonneVerticale][coordonneHorizontale] = new Case(coordonneVerticale, coordonneHorizontale,null);	
		}

		
		for (int i=0; i<NOMBRE_COLONNE_ECHIQUIER; i++)
		{
			this.Cases[6][i]=new Case(7, 7, new Pion(joueurBlanc));
			this.Cases[1][i]=new Case(7, 7, new Pion(joueurNoir));
		}
		
		this.Cases[7][6]=new Case(7, 7, new Cavalier(joueurBlanc));
		this.Cases[7][1]=new Case(7, 7, new Cavalier(joueurBlanc));
		
		
		
	}

	public String toString()
	{
		String affichage = "";

		affichage+="**********************************\n";

		for (int coordonneVerticale = 0; coordonneVerticale < 8; coordonneVerticale++)
		{
			for (int coordonneHorizontale = 0; coordonneHorizontale < 8; coordonneHorizontale++)
			{

				affichage+="* ";
				if (this.Cases[coordonneVerticale][coordonneHorizontale].obtenirPiece() != null)
					affichage += this.Cases[coordonneVerticale][coordonneHorizontale].obtenirPiece()
					.ObtenirRepresentationTextuelle();
				else
					affichage += ".";
				affichage+=" ";
			}
			affichage += "*\n*********************************\n";
		}



		return affichage;
	}
	
	public void deplacerPiece(int nouvelleCoordonneVertical, int nouvelleCoordonneHorirontal, Case caseDeLaPieceADeplacer)
	{
		Cases[nouvelleCoordonneVertical][nouvelleCoordonneHorirontal].poserPiece(caseDeLaPieceADeplacer.obtenirPiece());
	}

	
}
