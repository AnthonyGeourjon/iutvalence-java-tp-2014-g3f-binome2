package fr.iutvalence.java.echec;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author geourjoa
 *
 */
public class echiquierGraphique extends JPanel
{
	/**
	 *  Nombre de colonne de l'echiquier²
	 */
	private int nombreDeColonnes;
	
	/**
	 * Nombre de ligne de l'echiquier
	 */
	private int nombreDeLignes;
	
	/**
	 * grille des JButtons
	 */
	private JButtonPosition[][] grille;
	
	private Echiquier echiquierQuiSeraRepresente;

	/**
	 * Constructeur
	 * @param echiquierARepresenter 
	 */
	public echiquierGraphique(Echiquier echiquierARepresenter)
	{
		this.ajouterUneGrilleDeBoutons(echiquierARepresenter.getNombreDeColonnes(), echiquierARepresenter.getNombreDeLignes());
		this.echiquierQuiSeraRepresente= echiquierARepresenter;
	}

	/**
	 * @param nombreDeLignes nombre de ligne
	 * @param nombreDeColonnes nombre de colonne
	 */
	private void ajouterUneGrilleDeBoutons(int nombreDeLignes, int nombreDeColonnes)// ActionListener
																					// auditeurBoutons
	{
		this.nombreDeColonnes=nombreDeColonnes;
		this.nombreDeLignes=nombreDeLignes;
		
		
		this.grille=new JButtonPosition[nombreDeColonnes][nombreDeLignes];
		
		this.setLayout(new GridLayout(nombreDeLignes, nombreDeColonnes));
		
		for (int numeroDeColonne = 0; numeroDeColonne < nombreDeColonnes; numeroDeColonne++)
		{
			for (int numeroDeLigne = 0; numeroDeLigne < nombreDeColonnes; numeroDeLigne++)
			{
				JButtonPosition boutonCourant = new JButtonPosition(new Position(numeroDeLigne, numeroDeColonne));
				// bouton.addActionListener(auditeurBoutons);
				this.add(boutonCourant);
				
				this.grille[numeroDeLigne][numeroDeColonne]=boutonCourant;
			}
		}

		
	}
	
	/**
	 * @param echiquier echiquier sur lequel on affichera
	 */
	public void afficherLesPieces(Echiquier echiquier)
	{		
		for(int numeroDeLigne=0; numeroDeLigne<this.nombreDeLignes; numeroDeLigne++)
		{
			for(int numeroDeColonne=0; numeroDeColonne<this.nombreDeColonnes; numeroDeColonne++)
			{
				this.grille[numeroDeLigne][numeroDeColonne].setName(echiquier.getCases()[numeroDeLigne][numeroDeColonne].obtenirPiece().toString());
			}
		}
	}

}
