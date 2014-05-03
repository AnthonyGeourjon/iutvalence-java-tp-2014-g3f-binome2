package fr.iutvalence.java.echec;

/**
 * Implementation d'un affichage en mode console
 * 
 * @author sebastienjean
 * 
 */
public class AffichageConsole implements Affichage
{

	@Override
	public void afficherDemandeDeCaseDepart()
	{
		System.out.println("Saisissez la case de depart");
	}

	@Override
	public void afficherDemandeDeCaseDArrivee()
	{
		System.out.println("Saisissez la case d'arrivee");
	}

	@Override
	public void afficherTour(int numeroTour, Echiquier echiquier)
	{
		System.out.println("Tour numéro : " + numeroTour);
		System.out.println(echiquier);
	}

}
