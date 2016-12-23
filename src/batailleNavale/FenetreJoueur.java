package batailleNavale;

import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;



public class FenetreJoueur extends JFrame {
	
	private JPanel contentPane;
	private GrilleGraphique grilleTirs;
	private GrilleNavaleGraphique grilleDefense;
	
	public FenetreJoueur() { 
//		this("Nom du joueur", 8);
		super();
	}
	
	public FenetreJoueur(String nom,int taille) {
		
//		int[] navires = { 4, 4, 3};
		grilleDefense = new GrilleNavaleGraphique(taille);
//		grilleDefense.placementAuto(navires);
		GrilleGraphique g = grilleDefense.getGrilleGraphique();

		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

		// probleme dans le constructeur taille grilleTir != taille grilleDefense
		grilleTirs = new GrilleGraphique(taille);
		
		
		grilleTirs.setBorder(new TitledBorder(null, "Grille de tir", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(grilleTirs);

		g.setBorder(new TitledBorder(null, "Grille de defense", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(g);
		g.setClicActive(false); // pour griser les cases
		
		setTitle(nom);
		
	}

	public GrilleGraphique getGrilleTirs() {
		return (this.grilleTirs);
	}
	
	public GrilleNavaleGraphique getGrilleDefense() {
		return (this.grilleDefense);
	}
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					
//					FenetreJoueur frame = new FenetreJoueur("A ", 10);
//					frame.setVisible(true);
//					
//					// Auto-size la fenêtre en fonction de la disposition des éléments
//					frame.pack();
//					frame.setSize(600, 300);
////					frame.dispatchEvent(new WindowEvent(myFrame, WindowEvent.WINDOW_CLOSING));
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
}