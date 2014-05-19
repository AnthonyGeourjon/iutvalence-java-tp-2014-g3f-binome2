package fr.iutvalence.java.echec;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class AffichageGraphique implements Runnable, Affichage
{
	private JFrame fenetre;
	
	private echiquierGraphique echiquierGraphique;

	public AffichageGraphique()
	{
		SwingUtilities.invokeLater(this);
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
