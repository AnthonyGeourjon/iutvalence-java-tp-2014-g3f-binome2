package fr.iutvalence.java.echec;

/**
 * Represente le support de jeu, c'est un damier de 8 * 8 cases, alternativement
 * noires et blanches. Sur ces cases on trouve des pièces ou non.
 */
public class Echiquier
{

	/** Nombre de lignes d'un échiquier. */
	public static final int NOMBRES_LIGNES_ECHIQUIER = 8;

	/**
	 * Nombre de pièces sur l'échiquier
	 */
	private static final int NOMBRE_DE_PIECES = 32;

	/** Nombre de colonne de l'échiquier. */
	public static int NOMBRES_COLONNES_ECHIQUIER = 8;

	// TODO corriger le commentaire
	/** Pieces du joueur. */
	private Piece[] piecesSurLEchiquier;

	// TODO écrire un commentaire
	public Echiquier()
	{
		this.piecesSurLEchiquier = new Piece[NOMBRE_DE_PIECES];
	}

	public String toString()
	{
		String representationEchiquier = "";
		for(int i=0; i<NOMBRE_DE_PIECES; i++)
			representationEchiquier+=("Pièce numéro " + i + piecesSurLEchiquier[i].toString()+"\n");
		return representationEchiquier;
	}
}
