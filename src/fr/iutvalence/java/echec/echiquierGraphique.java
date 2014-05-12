package fr.iutvalence.java.echec;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class echiquierGraphique extends JPanel
{


	public echiquierGraphique()//ActionListener auditeurBoutons
	{
		this.ajouterUneGrilleDeBoutons(8, 8);// auditeurBoutons
	}
	
	
	
	private void ajouterUneGrilleDeBoutons(int nombreDeLignes, int nombreDeColonnes
			)//ActionListener auditeurBoutons
	{
		this.setLayout(new GridLayout(nombreDeLignes, nombreDeColonnes));

		for (int numeroDeBouton = 0; numeroDeBouton < nombreDeColonnes*nombreDeLignes; numeroDeBouton++)
		{
			JButton bouton = new JButton(""+numeroDeBouton);
			//bouton.addActionListener(auditeurBoutons);
			this.add(bouton);
		}
	}

}
