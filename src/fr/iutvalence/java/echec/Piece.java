package fr.iutvalence.java.echec;

/**
 * La classe Piece.
 */
public abstract class Piece
{

	/** Le proprietaire de la piece. */
	protected Joueur proprietaire;

	/**
	 * Representation en console de la piece
	 */
	protected String representationTextuelle;

	/**
	 * @param joueurproprietaire
	 *            Assigne a une piece un proprietaire
	 */
	public Piece(Joueur joueurproprietaire)
	{
		this.proprietaire = joueurproprietaire;
	}

	/**
	 * @return une chaine de caractere representant l'echiquier
	 */
	public String ObtenirRepresentationTextuelle()
	{
		return this.representationTextuelle;
	}

}
