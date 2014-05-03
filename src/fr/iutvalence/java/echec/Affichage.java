package fr.iutvalence.java.echec;

/**
 * Interface décrivant le comportement attendu d'un affichage
 * @author sebastienjean
 *
 */
public interface Affichage
{

	/**
	 * Afficher la demande de case de départ
	 */
	public void afficherDemandeDeCaseDepart();

	/**
	 * Afficher la demande de case d'arrivée
	 */
	public void afficherDemandeDeCaseDArrivee();

	/**
	 * Afficher un tour
	 * @param numeroTour le numéro du tour
	 * @param echiquier l'echiquier au début du tour
	 */
	public void afficherTour(int numeroTour, Echiquier echiquier);

}
