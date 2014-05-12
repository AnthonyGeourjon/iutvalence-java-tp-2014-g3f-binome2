package fr.iutvalence.java.echec;
import javax.swing.SwingUtilities;

public class AffichageGraphique implements Affichage
{
	public AffichageGraphique()
	{
		SwingUtilities.invokeLater(new interfaceGraphique());
	}
	
	@Override
	public void afficherDemandeDeCaseDepart()
	{
		// TODO exception à traiter !
	}

	@Override
	public void afficherDemandeDeCaseDArrivee()
	{
		// TODO exception à traiter !
	}

	@Override
	public void afficherTour(int numeroTour, Echiquier echiquier)
	{
		// TODO exception à traiter !
	}
}
