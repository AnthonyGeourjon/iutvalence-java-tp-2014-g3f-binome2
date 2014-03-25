package fr.iutvalence.java.echec;

public class Echiquier
{
	private Case[][] Cases;

	public Echiquier(Joueur joueurBlanc, Joueur joueurNoir)
	{
		this.Cases=new Case[8][8];
		
		placerPieceSurLEchiquier(joueurBlanc, joueurNoir);
	}

	private void placerPieceSurLEchiquier(Joueur joueurBlanc, Joueur joueurNoir)
	{
		for (int coordonneVerticale = 0; coordonneVerticale < 8; coordonneVerticale++)
		{
			for (int coordonneHorizontale = 0; coordonneHorizontale < 8; coordonneHorizontale++)
				Cases[coordonneVerticale][coordonneHorizontale] = new Case(coordonneVerticale, coordonneHorizontale,null);	
		}
		
		Cases[7][7]=new Case(7, 7, new Piece(joueurBlanc));
		Cases[0][0]=new Case(0, 0, new Piece(joueurNoir));
	}

	public String toString()
	{
		String affichage = "";

		for (int coordonneVerticale = 0; coordonneVerticale < 8; coordonneVerticale++)
		{
			for (int coordonneHorizontale = 0; coordonneHorizontale < 8; coordonneHorizontale++)
			{

				if (this.Cases[coordonneVerticale][coordonneHorizontale].obtenirPiece() != null)
					affichage += this.Cases[coordonneVerticale][coordonneHorizontale].obtenirPiece()
							.ObtenirRepersentationTextuelle();
				else
					affichage += ".";
			}
			affichage += "\n";
		}

		return affichage;
	}
}
