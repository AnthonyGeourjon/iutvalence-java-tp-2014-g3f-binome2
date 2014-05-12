package fr.iutvalence.java.echec;

import javax.swing.*;

public class JButtonPosition extends JButton
{

	private final Position position;

	public JButtonPosition(Position position)
	{
		super();
		this.position = position;
	}

	public Position getPosition()
	{
		return position;
	}
	


	
}
