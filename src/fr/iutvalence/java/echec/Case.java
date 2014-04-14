package fr.iutvalence.java.echec;

import fr.iutvalence.java.echec.Exception.PiecedeMemeCouleurException;
import fr.iutvalence.java.echec.Piece.Piece;

/**
 * Cases d'un echiquier
 * 
 * @author geourjoa
 */
public class Case
{
	/**
	 * Piece posée sur la case si elle existe, <tt>null</tt> sinon
	 */
	private Piece piecePosee;

	/**
	 * Cree une nouvelle case, intialement vide.
	 * 
	 */
	public Case()
	{
		this.piecePosee = null;
	}

	/**
	 * Cree une nouvelle case, avec une pièce déjà posée.
	 * 
	 * @param piece
	 *            piece à poser sur la case
	 */
	public Case(Piece piece)
	{
		this.piecePosee = piece;
	}

	/**
	 * Obtenir la pièce posée sur la case
	 * 
	 * @return la piece posée sur la case si elle existe, <tt>null</tt> sinon
	 */
	public Piece obtenirPiece()
	{
		// TODO Auto-generated method stub
		return this.piecePosee;
	}

	/**
	 * Poser une pièce sur la case
	 * 
	 * @param piece
	 *            la pièce à poser sur la case
	 * @throws PiecedeMemeCouleurException levé si couleur equivalente
	 */
	public void poserPiece(Piece piece) throws PiecedeMemeCouleurException
	{

		if ((this.piecePosee != null) && (piece.obtenirCouleur() == this.piecePosee.obtenirCouleur()))
			throw new PiecedeMemeCouleurException();
		else
			this.piecePosee = piece;
	}

	/**
	 * Retirer la piece de la case.
	 * 
	 * 
	 * @return la pièce qui était sur la case
	 */
	public Piece enleverPiece()
	{
		Piece anciennePiece = this.piecePosee;
		this.piecePosee = null;
		return anciennePiece;
	}

}
