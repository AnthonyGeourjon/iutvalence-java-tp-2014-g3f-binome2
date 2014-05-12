package fr.iutvalence.java.echec;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class echiquierGraphique extends JPanel
{

	public echiquierGraphique()// ActionListener auditeurBoutons
	{
		this.ajouterUneGrilleDeBoutons(8, 8);// auditeurBoutons
	}

	private void ajouterUneGrilleDeBoutons(int nombreDeLignes, int nombreDeColonnes)// ActionListener
																					// auditeurBoutons
	{
		this.setLayout(new GridLayout(nombreDeLignes, nombreDeColonnes));

		for (int numeroDeColonne = 0; numeroDeColonne < nombreDeColonnes; numeroDeColonne++)
		{
			for (int numeroDeLigne = 0; numeroDeLigne < nombreDeColonnes; numeroDeLigne++)
			{
				JButtonPosition bouton = new JButtonPosition(new Position(numeroDeLigne, numeroDeColonne));
				// bouton.addActionListener(auditeurBoutons);
				this.add(bouton);
			}
		}
	}

}
