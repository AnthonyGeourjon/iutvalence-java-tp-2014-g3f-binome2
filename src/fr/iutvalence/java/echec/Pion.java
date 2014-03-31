package fr.iutvalence.java.echec;

public class Pion extends Piece
{

	/**
	 * 
	 * Cree un pion de couleur 
	 * @param couleur couleur du pion 
	 */
	public Pion(Couleur couleur)
	{
		super(couleur);
	}

	
	@Override
	public String toString() {
		return "P"+ this.obtenirCouleur().toString();
	}	

}
