package fr.iutvalence.java.echec;

/**
 * @author geourjoa
 * Represente la plateau de jeu 
 */
public class Echiquier
{
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
		
		this.Cases[7][7]=new Case(7, 7, new Piece(joueurBlanc));
		this.Cases[0][0]=new Case(0, 0, new Piece(joueurNoir));
	}

	public String toString()
	{
		String affichage = "";

		affichage+="*********************************\n";
		
		for (int coordonneVerticale = 0; coordonneVerticale < 8; coordonneVerticale++)
		{
			for (int coordonneHorizontale = 0; coordonneHorizontale < 8; coordonneHorizontale++)
			{

				affichage+="* ";
				if (this.Cases[coordonneVerticale][coordonneHorizontale].obtenirPiece() != null)
					affichage += this.Cases[coordonneVerticale][coordonneHorizontale].obtenirPiece()
							.ObtenirRepersentationTextuelle();
				else
					affichage += ".";
				affichage+=" ";
			}
			affichage += "*\n*********************************\n";
		}
		
		

		return affichage;
	}
}
