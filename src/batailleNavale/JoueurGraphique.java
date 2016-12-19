package batailleNavale;

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
		return (GrilleNavaleGraphique) (super.getGrille());
		
	}
	
	public void jouerAvec(Joueur j) {
		super.jouerAvec(j);
		
	}
	
	public void debutAttaque() {
	}
	
	protected void retourDefense(Coordonnee c,int etat) {
		if(etat==COULE) {
			JOptionPane.showMessageDialog(grilleTirs,"Dommage, votre navire a été coulé en "+c);
		}
	}
	
	protected void perdu() {
//		super.
	}
	
	protected void gagne() {
		
	}
	
	protected void retourAttaque(Coordonnee c,int etat) {
//		super.
	}
	
	public void caseClick(Coordonnee c) {
		if(tirActif) {
			setTirActif(false);
			this.attaque(c);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] navires = { 4, 4, 3};
		String nom = "Bro";
		
		GrilleNavaleGraphique grille1 = new GrilleNavaleGraphique(10);
		GrilleGraphique grilleGraph1 = new GrilleGraphique();
		
		JoueurGraphique j1 = new JoueurGraphique(grille1, grilleGraph1, nom);
				
				

	}

}
