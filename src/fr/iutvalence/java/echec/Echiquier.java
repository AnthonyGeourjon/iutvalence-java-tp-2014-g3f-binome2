package fr.iutvalence.java.echec;

import fr.iutvalence.java.echec.Exception.PiecedeMemeCouleurException;
import fr.iutvalence.java.echec.Piece.Cavalier;
import fr.iutvalence.java.echec.Piece.Fou;
import fr.iutvalence.java.echec.Piece.Pion;
import fr.iutvalence.java.echec.Piece.Reine;
import fr.iutvalence.java.echec.Piece.Roi;
import fr.iutvalence.java.echec.Piece.Tour;

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
	public Case[][] cases;

	/**
	 * Cree un nouvel echiquier, avec les pièces déjà disposées
	 * 
	 */
	public Echiquier()
	{
		this.cases = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		placerPieceSurLEchiquier();
	}

	/**
	 * Factorisation du code du constructeur.
	 */

	private void placerPieceSurLEchiquier()
	{

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				this.cases[numeroDeLigne][numeroDeColonne] = new Case();

		for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
		{
			try
			{
				this.cases[NOMBRE_DE_LIGNES - 2][numeroDeColonne].poserPiece(new Pion(Couleur.BLANC, this));
				this.cases[1][numeroDeColonne].poserPiece(new Pion(Couleur.NOIR, this));
			}
			catch (PiecedeMemeCouleurException e)
			{
				e.printStackTrace();
			}
		}
		
		try
		{
			this.cases[0][0].poserPiece(new Tour (Couleur.NOIR, this));
			this.cases[0][1].poserPiece(new Cavalier(Couleur.NOIR, this));
			this.cases[0][2].poserPiece(new Fou(Couleur.NOIR, this));
			this.cases[0][3].poserPiece(new Reine (Couleur.NOIR, this));
			this.cases[0][4].poserPiece(new Roi(Couleur.NOIR, this));
			this.cases[0][5].poserPiece(new Fou(Couleur.NOIR, this));
			this.cases[0][6].poserPiece(new Cavalier(Couleur.NOIR, this));
			this.cases[0][7].poserPiece(new Tour (Couleur.NOIR, this));
			
			this.cases[7][0].poserPiece(new Tour (Couleur.BLANC, this));
			this.cases[7][1].poserPiece(new Cavalier(Couleur.BLANC, this));
			this.cases[7][2].poserPiece(new Fou(Couleur.BLANC, this));
			this.cases[7][3].poserPiece(new Reine (Couleur.BLANC, this));
			this.cases[7][4].poserPiece(new Roi(Couleur.BLANC, this));
			this.cases[7][5].poserPiece(new Fou(Couleur.BLANC, this));
			this.cases[7][6].poserPiece(new Cavalier(Couleur.BLANC, this));
			this.cases[7][7].poserPiece(new Tour (Couleur.BLANC, this));
		}
		catch (PiecedeMemeCouleurException e)
		{
			e.printStackTrace();
		}

	}

	public String toString()
	{
		String affichage = "";

		affichage += "      *************************************************\n";
		affichage += "      *  a  *  b  *  c  *  d  *  e  *  f  *  g  *  h  *\n";
		affichage += "*******************************************************\n";

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
		{

			affichage += "*  " + (numeroDeLigne + 1) + "  ";

			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
			{
				affichage += "* ";

				if (this.cases[numeroDeLigne][numeroDeColonne].obtenirPiece() != null)
				{
					affichage += this.cases[numeroDeLigne][numeroDeColonne].obtenirPiece().toString();
					affichage += " ";
				}

				else affichage += ".. ";
				affichage += " ";
			}
			affichage += "*\n*******************************************************\n";
		}

		return affichage;
	}

	/**
	 * @param caseDeLaPieceADeplacer case d'une piece
	 * @param caseDestination case de destination de la piece de situer sur caseDeLaPieceADeplacer
	 */
	public void deplacerPiece(Case caseDeLaPieceADeplacer, Case caseDestination)
	{

		try
		{
			caseDestination.poserPiece(caseDeLaPieceADeplacer.obtenirPiece());
			caseDeLaPieceADeplacer.enleverPiece();
		}
		catch (PiecedeMemeCouleurException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @param positionPropose Position de la case que l'on souhaite obtenir
	 * @return la case associé à la position en parmatre
	 */
	public Case obtenirCase(Position positionPropose)
	{
		return this.cases[positionPropose.obtenirNumeroDeLigne()][positionPropose.obtenirNumeroDeColonne()];
	}

	/**
	 * @param positionDepart place intitiale de la piece
	 * @param positionDestination place 
	 * @param couleurJoueur couleur du joueur qui souhaite verifier son coup
	 * @return vrai si le mouvement est correcte, faux sinon
	 */
	public boolean verifierMouvement(Position positionDepart, Position positionDestination, Couleur couleurJoueur)
	{
		if (this.cases[positionDepart.obtenirNumeroDeLigne()][positionDepart.obtenirNumeroDeColonne()].obtenirPiece().obtenirCouleur()!=couleurJoueur)
			return false;
		
		if (this.cases[positionDepart.obtenirNumeroDeLigne()][positionDepart.obtenirNumeroDeColonne()].obtenirPiece()==null)
			return false;
		
		return this.cases[positionDepart.obtenirNumeroDeLigne()][positionDepart.obtenirNumeroDeColonne()].obtenirPiece()
				.verifierDeplacement(positionDepart, positionDestination);
	}
	
	/**
	 * @param positionAVerifier si la position est associé a une piece
	 * @return vrai si il y a une piece
	 */
	public boolean possedeUnePiece(Position positionAVerifier)
	{
		if(this.cases[positionAVerifier.obtenirNumeroDeLigne()][positionAVerifier.obtenirNumeroDeColonne()].obtenirPiece()==null)
			return false;
		return true;
	}
}
