package fr.iutvalence.java.echec;

import javax.swing.JFrame;

public class interfaceGraphique implements Runnable
{

	private JFrame fenetre;
	
	private echiquierGraphique echiquierGraphique;

	@Override
	public void run()
	{
		this.fenetre = new JFrame();
		this.echiquierGraphique= new echiquierGraphique();
		
		this.fenetre.add(this.echiquierGraphique);
		this.fenetre.setVisible(true);

	}

}
