package fr.iutvalence.java.echec;

import fr.iutvalence.java.echec.Exception.PiecedeMemeCouleurException;
import fr.iutvalence.java.echec.Piece.Pion;

/**
 * @author geourjoa Represente la plateau de jeu
 */
public class Echiquier
{
	/**
	 * Nombre de colonne de l'échiquier
	 */
	private static final int NOMBRE_DE_COLONNES = 8;

	/**
	 * Nombre de ligne de l'échiquier
	 */
	private static final int NOMBRE_DE_LIGNES = 8;

	/**
	 * Ensemble des cases du jeu
	 */
	public Case[][] Cases;

	/**
	 * Cree un nouvel echiquier, avec les pièces déjà disposées
	 * 
	 */
	public Echiquier()
	{
		this.Cases = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		placerPieceSurLEchiquier();
	}

	/**
	 * Factorisation du code du constructeur.
	 * 
	 * @param joueurBlanc
	 *            idem que Echiquier()
	 * @param joueurNoir
	 *            idem
	 */

	private void placerPieceSurLEchiquier()
	{
		// TODO Finir de plcare les piece, gerer les deplacement vaide

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				this.Cases[numeroDeLigne][numeroDeColonne] = new Case();

		for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
		{
			try
			{
				this.Cases[NOMBRE_DE_LIGNES - 2][numeroDeColonne].poserPiece(new Pion(Couleur.BLANC));
				this.Cases[1][numeroDeColonne].poserPiece(new Pion(Couleur.NOIR));
			}
			catch (PiecedeMemeCouleurException e)
			{
				e.printStackTrace();
			}
		}

	}

	public String toString()
	{
		String affichage = "";

		affichage += "*****************************************\n";

		for (int coordonneVerticale = 0; coordonneVerticale < 8; coordonneVerticale++)
		{
			for (int coordonneHorizontale = 0; coordonneHorizontale < 8; coordonneHorizontale++)
			{

				affichage += "* ";
				if (this.Cases[coordonneVerticale][coordonneHorizontale].obtenirPiece() != null)
					affichage += this.Cases[coordonneVerticale][coordonneHorizontale].obtenirPiece().toString();
				else
					affichage += "..";
				affichage += " ";
			}
			affichage += "*\n*****************************************\n";
		}

		return affichage;
	}

	public void deplacerPiece(Case caseDeLaPieceADeplacer, Case caseDestination)
	{

		try
		{
			caseDestination.poserPiece(caseDeLaPieceADeplacer.obtenirPiece());
			caseDeLaPieceADeplacer.enleverPiece();
		}
		catch (PiecedeMemeCouleurException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Case obtenirCase(Position positionPropose)
	{
		return Cases[positionPropose.obtenirNumeroDeColonne()][positionPropose.obtenirNumeroDeLigne()];
	}

	public boolean verifierMouvement(Position positionDepart, Position positionDestination)
	{
		return this.Cases[positionDepart.obtenirNumeroDeLigne()][positionDepart.obtenirNumeroDeColonne()]
		        .obtenirPiece().verifierDeplacement(positionDepart, positionDestination);
	}
}
