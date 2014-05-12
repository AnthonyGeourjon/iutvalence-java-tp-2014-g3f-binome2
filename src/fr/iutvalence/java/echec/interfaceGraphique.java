package fr.iutvalence.java.echec;

import javax.swing.JFrame;

public class interfaceGraphique implements Runnable
{

	private JFrame fenetre;

	@Override
	public void run()
	{
		this.fenetre = new JFrame();
		this.fenetre.add(new echiquierGraphique());
		this.fenetre.setVisible(true);

	}

}
