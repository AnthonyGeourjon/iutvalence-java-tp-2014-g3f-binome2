package fr.iutvalence.java.echec;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

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
		
		this.fenetre.setTitle("Echec");
		this.fenetre.setSize(400, 400);
		this.fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		// Verouillage des dimensions de la fenêtre
		this.fenetre.setResizable(false);

	}

}
