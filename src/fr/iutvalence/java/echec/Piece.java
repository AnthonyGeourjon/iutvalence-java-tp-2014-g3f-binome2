package fr.iutvalence.java.echec;

/**
 * La classe Piece.
 */
public class Piece
{

	/** Le proprietaire de la piece. */
	private Joueur proprietaire;

	/**
	 * Representation en console de la piece
	 */
	private String repersentationTextuelle;

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
	public String ObtenirRepersentationTextuelle()
	{
		if (proprietaire.getCouleurDuJoueur()==Couleur.Blanc)
			return "P";
		return "p";
	}

}
