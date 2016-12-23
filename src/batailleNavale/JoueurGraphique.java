package batailleNavale;

import java.awt.*;
import javax.swing.*;

public class JoueurGraphique extends Joueur implements CaseClickListener {
	private GrilleGraphique grilleTirs;
	private boolean tirActif;
	
	public JoueurGraphique(GrilleNavaleGraphique grilleDefense,GrilleGraphique grilleTirs, String nom) {
			
		super(grilleDefense,nom);
		this.grilleTirs = grilleTirs;
	}
	
	private void setTirActif(boolean b) {
		this.tirActif = b;

	}
	
	public GrilleNavaleGraphique getGrille() {
//		return (this.getGrille());
		
		// a verifier
		return (GrilleNavaleGraphique) (super.getGrille());
		
	}
	
	public void jouerAvec(Joueur j) {
		super.jouerAvec(j);
		
	}
	
	/*
	 * Consiste simplement à activer le tir sur grilleTirs .
	 * @see batailleNavale.Joueur#debutAttaque()
	 */
	public void debutAttaque() {
	}
	
	protected void retourDefense(Coordonnee c,int etat) {
		if(etat==COULE) {
			JOptionPane.showMessageDialog(grilleTirs,"Dommage, votre navire a été coulé en "+c);
			// colorier la case
		}
	}
	
	protected void perdu() {
		JOptionPane.showMessageDialog(grilleTirs, "Vous avez perdu !");
	}
	
	protected void gagne() {
		JOptionPane.showMessageDialog(grilleTirs, "Vous avez gagné !");
	}
	
	/*
	 * Affichage d'un JOptionPane lorsque le tir a permis de couler un navire. Cette méthode doit également colorier la case 
	 * correspondant à c dans grilleTirs en fonction de etat. 
	 * * @see batailleNavale.Joueur#retourAttaque(batailleNavale.Coordonnee, int)
	 */
	protected void retourAttaque(Coordonnee c,int etat) {
		if(etat == TOUCHE) {
			this.grilleTirs.colorie(c, Color.RED);
			JOptionPane.showMessageDialog(grilleTirs, "Batteau ennemie touché en: "+c);			
			
			} else if (etat == COULE) {
				this.grilleTirs.colorie(c, Color.RED);
				JOptionPane.showMessageDialog(grilleTirs, "Batteau ennemie coulé en: "+c);			
			
			} else if (etat == A_L_EAU) { 
				this.grilleTirs.colorie(c, Color.BLUE);
				JOptionPane.showMessageDialog(grilleTirs, "Tir à l'eau en: "+c);			
			
		}
		
		
		
	}
	
	public void caseClick(Coordonnee c) {
		if(tirActif) {
			setTirActif(false);
			this.attaque(c);
		}
	}
	

	public static void main(String[] args) {
//		// TODO a vérifier
//		
		int[] navires = { 4, 4, 3};
		String nom = "Bro";
		String nom2 = "Gramme";
		
		GrilleNavaleGraphique grille1 = new GrilleNavaleGraphique(10);
		GrilleNavaleGraphique grille2 = new GrilleNavaleGraphique(10);
		
		GrilleGraphique grilleGraph1 = new GrilleGraphique();
		GrilleGraphique grilleGraph2 = new GrilleGraphique();
		
		JoueurGraphique j1 = new JoueurGraphique(grille1, grilleGraph1, nom);
		JoueurGraphique j2 = new JoueurGraphique(grille2, grilleGraph2, nom2);		
		
		j1.jouerAvec(j2);
		j1.debutAttaque();
				

	}

}
