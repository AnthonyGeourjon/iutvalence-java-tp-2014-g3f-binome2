package fr.iutvalence.java.echec;

public class Piece
{
	private Joueur proprietaire;

	private Position positionDeLaPiece;

	public void deplacer(Position nouvellePosition)
	{
		this.positionDeLaPiece = nouvellePosition;
	}
	
	public void retirerPiece(Piece pieceARetirer)
	{
		pieceARetirer=null;
		
	}

}
