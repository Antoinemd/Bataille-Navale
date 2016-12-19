package batailleNavale;

import java.util.Scanner;

public class JoueurTexte extends Joueur {	
	private Scanner sc = new Scanner(System.in);

	public JoueurTexte(GrilleNavale g, String nom) {
		super(g, nom);
	}
	
	public void jouerAvec(Joueur j) {
		super.jouerAvec(j);
		
	}
	
	protected void perdu() {
		System.out.println(this.getNom()+" a perdu la partie !");
	}
	
	protected void gagne() {
		System.out.println(this.getNom()+" a gagné la partie !");
	}
	
	protected void retourAttaque(Coordonnee c, int etat) {
		
		if(etat == TOUCHE) {
			System.out.println(this.getNom() + " touche un bateau en " + c);
			} else if (etat == COULE) {
				System.out.println(this.getNom() + " coule un bateau en " + c);
			} else if (etat == A_L_EAU) { 
				System.out.println(this.getNom() + " tire à l'eau en " + c );
			} else {
				System.out.println("état: " + etat);
			}
		
	}
	
	protected void retourDefense(Coordonnee c,	int	etat) {
		System.out.println("Le joueur " + this.getNom() + " est attaqué ! ");
		System.out.println(" retourDefense, Grille de " + this.getNom() + " : \n" + this.getGrille());
	}
	
	
	public void debutAttaque() {
		
		String inputCoordStr = "";
		Coordonnee inputCoord = new Coordonnee(0,0);
		System.out.println("------------------------------------------");
		System.out.println("C'est au tour de "+this.getNom()+ " de jouer !");
		
//		while (inputCoord.) {
			
			System.out.println("En quelle coordonnée allez-vous tirer ?: \n");
			
			inputCoordStr = this.sc.nextLine();
			inputCoord = new Coordonnee(inputCoordStr);
			
//		}
		
		this.attaque(inputCoord);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coordonnee c1 = new Coordonnee("B2");
		Navire n1 = new Navire(c1, 3, false);
		GrilleNavale g1 = new GrilleNavale(5,1);
		
		g1.ajouteNavire(n1);
		System.out.println("Affichage de J1 \n" + g1 + "\n");
		
		
		int []taillesNavires = {3};
		Navire n2 = new Navire(c1, 3, false);
		GrilleNavale g2 = new GrilleNavale(5, taillesNavires);
		System.out.println("Affichage de J2 \n" + g2 + "\n");
		
		JoueurTexte j1 = new JoueurTexte(g1, "Bro");
		JoueurTexte j2 = new JoueurTexte(g2, "Grammeur");
		
		j1.jouerAvec(j2);
		j1.debutAttaque();
		
	}

}
