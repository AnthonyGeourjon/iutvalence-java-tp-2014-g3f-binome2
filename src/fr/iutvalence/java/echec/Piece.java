package fr.iutvalence.java.echec;

/**
 * La classe Piece.
 */
public class Piece
{

	/** Le proprietaire de la piece. */
	private Joueur proprietaire;

	/** La position de la piece. */
	private Position positionDeLaPiece;

	/**
	 * Representation en console de la piece
	 */
	private String repersentationTextuelle;

	/**
	 * 
	 * 
	 * @param joueurproprietaire Assigne a une piece un proprietaire
	 * @param positionDeBase assigne la position au debut de la partie
	 */
	public Piece(Joueur joueurproprietaire, Position positionDeBase)
	{
		this.positionDeLaPiece = positionDeBase;
		this.proprietaire = joueurproprietaire;
		this.repersentationTextuelle = "P";
	}

	/**
	 * Deplacer la piece (changer de position).
	 */
	public void deplacer()
	{
		Position choixJoueur ; 
		
		do
		{
			choixJoueur=this.proprietaire.demanderCoordonneeDeDestinationDeLaPieceAJouee();
		}while(!this.deplacementCorrecte(choixJoueur));
		
		this.positionDeLaPiece=choixJoueur;
		

	}

	/**
	 * @param choixJoueur
	 * @return vraie si le deplacement est correcte, faux si non 
	 */
	private boolean deplacementCorrecte(Position choixJoueur)
	{
		return true;
	}

	/**
	 * Retirer la piece de l'echiquier (La piece est prise).        l
	 */
	

	public String ObtenirRepersentationTextuelle()
	{
		return repersentationTextuelle;
	}

}
