package batailleNavale;

import java.awt.*;

public class GrilleNavaleGraphique extends GrilleNavale {
	
	private GrilleGraphique grille;
	
	public GrilleNavaleGraphique(int taille) {
		
		// 2eme argument initialisé arbitrairement car on ne peut rien mettre d'autre.
		// car constructeur de GrilleNavale = public GrilleNavale(int taille, int nbNavires) {
		super(taille, 10);
		this.grille = new GrilleGraphique(taille);
	}
	
	
	public GrilleGraphique getGrilleGraphique() {
		return this.grille;
	}
	
	
	public boolean ajouteNavire(Navire n) {
		// on utilise le ajouteNavire de la classe mere
		if(super.ajouteNavire(n)){
			this.grille.colorie(n.getDebut(),n.getFin(), Color.GREEN);
			return true;
		}
		return false;
	}
	
	
	public boolean recoitTir(Coordonnee c) {
		if(super.recoitTir(c)) {
			if(this.estTouche(c)){
				this.grille.colorie(c, Color.red);
			}
			else{
				this.grille.colorie(c, Color.blue);
				}
			return true;
		}
		return false;
	}	
}
