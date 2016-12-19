package batailleNavale;

public abstract class Joueur {
	
	public final static	int	TOUCHE =1;
	public final static int COULE =2;
	public final static int A_L_EAU =3;
	
	private Joueur adversaire;
	private GrilleNavale grille;
	private String nom;
	
	public Joueur(GrilleNavale g, String nom) {
		this.grille = g;
		this.nom = nom;
	}
	
	public GrilleNavale getGrille() {
		return this.grille;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void	jouerAvec(Joueur j) {
		this.adversaire = j;
		j.adversaire = this;
	}
	
	
	public void attaque(Coordonnee c) {
	
		if(adversaire.defense(c)) {
			adversaire.debutAttaque();
			}
	}
	
	/*
	 * Retourne false si et seulement si la partie est terminée (le tir en c coule le dernier navire dans la grille de
	 * this). Cette méthode est invoquée par le joueur adverse lors d'une attaque de sa part. Un tir en c sur la grille de
	 * this est pris en compte et les conditions de victoire/défaite sont vérifiées. 
	 */
	
	public boolean defense(Coordonnee c) {
		
		int etat = 0;
		
		this.grille.recoitTir(c);
		
		// conditions de victoires vérifiées
		if(this.grille.perdu()){
			this.perdu();
			this.adversaire.gagne();
			return false;
		}
		
		// Si elles ne sont pas vérifiées
		if(this.grille.estTouche(c))
			etat = this.grille.estCoule(c) ? COULE : TOUCHE;
		else
			etat = A_L_EAU;
		
		retourDefense(c, etat);
		adversaire.retourAttaque(c, etat);
		return true;	
	}
	
	
	// invoqué lorsque this a perdu la partie. Agit sur l'interface.
	protected abstract void perdu();
	
	// invoqué lorsque this a gagné la partie. Agit sur l'interface.
	protected abstract void gagne();	
	
	// donne le droit d'attaquer à l'autre.
	protected abstract void retourAttaque(Coordonnee c, int etat);	
	
	// donne le droit de défendre à l'autre.
	protected abstract void retourDefense(Coordonnee c, int etat);	
	
	public abstract void debutAttaque();

}
