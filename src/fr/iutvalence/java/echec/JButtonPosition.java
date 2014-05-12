package fr.iutvalence.java.echec;

import javax.swing.*;

public class JButtonPosition extends JButton
{

	private Position position;
	
	public JButtonPosition(Integer numeroDeColonne, Integer numeroDeLigne)
	{
		this.position = new Position(numeroDeLigne, numeroDeColonne);
	}
	
}
