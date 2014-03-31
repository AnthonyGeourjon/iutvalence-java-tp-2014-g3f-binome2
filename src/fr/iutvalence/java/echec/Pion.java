package fr.iutvalence.java.echec;

public class Pion extends Piece
{

	public Pion(Couleur couleur)
	{
		super(couleur);
	}

	@Override
	public String toString() {
		return "P"+ this.obtenirCouleur().toString();
	}	

}
