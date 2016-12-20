package batailleNavale;

public class Navire {
	private Coordonnee debut;
	private Coordonnee fin;
	private Coordonnee[] partiesTouchees;
	private int nbTouchees;
	private boolean estHorizontal;

	
	/*
	 *  Constructeur Navire: le navire est placé en fonction de son début, de la gauche vers la droite et du haut vers le bas
	 *  @param: type Coordonnée: coordonnées de début
	 *  		int longueur: longueur du bateau
	 *  		boolean estVertical: indique si le bateau doit etre placé verticalement ou horizontalement
	 */
	public Navire(Coordonnee debut, int longueur, boolean estVertical) {
		this.debut = debut;

		this.fin = !estVertical ? new Coordonnee(this.debut.getLigne(), this.debut.getColonne() + longueur - 1): // horizontal
								  new Coordonnee(this.debut.getLigne() + longueur-1, this.debut.getColonne()); 	// estVertical
		
		this.estHorizontal = estVertical ? false:true; // Si estVertical = vrai alors estHorizontal = false
				
		this.partiesTouchees = new Coordonnee[longueur];
		this.nbTouchees = 0;
	}
	
	/* Getter servant à récupérer la coordonnées de début du navire
	 * return Coordonnee
	 */
	public Coordonnee getDebut() {
		return debut;
	}

	/* Getter servant à récupérer la coordonnées de fin du navire
	 * return Coordonnee
	 */
	public Coordonnee getFin() {
		return fin;
	}
	
	/*
	 * Affiche la String de this et affiche "Coordonnee debut, Coordonnee fin, longueur, direction)
	 * return String
	 */
	public String toString(){
		
		String str="";

		return (str = estHorizontal ? 
				(this.debut+", " + this.fin+", " + (this.fin.getColonne()-this.debut.getColonne()+1) +", Horizontal") : 
					(this.debut+", " + this.fin+", " + (this.fin.getLigne() - this.debut.getLigne() + 1) +", Vertical"));		
	}

	/*
	 * Retourne true si et seulement si this occupe c. 
	 */
	public boolean contient(Coordonnee c) {
		
		return (
			(c.getLigne() == this.debut.getLigne())	
				&& ((c.getColonne() >= this.debut.getColonne())	
				&& ((c.getColonne() <= this.fin.getColonne())))	
			|| 
			((c.getColonne() == this.debut.getColonne()) 
				&& ((c.getLigne() >= this.debut.getLigne()) 
				&& ((c.getLigne() <= this.fin.getLigne())))));
	}

	
	
	public boolean touche(Navire n) {
		if (((n.fin.getLigne() + 1 == this.debut.getLigne()
				|| n.debut.getLigne() == this.fin.getLigne() + 1)
				&&(n.debut.getColonne() <= this.fin.getColonne() && n.fin.getColonne() >= this.debut.getColonne()))	
				||
				(n.fin.getColonne() + 1 == this.debut.getColonne() 
				|| n.debut.getColonne() == this.fin.getColonne() + 1)
				&&(n.debut.getLigne() <= this.fin.getLigne() && n.fin.getLigne() >= this.debut.getLigne()))
				return true;
	return false;
	}

	
	public boolean chevauche(Navire n) {
		return ((n.debut.getLigne() <= this.fin.getLigne()) && (n.fin.getLigne() >= this.debut.getLigne()) 
			&& (n.debut.getColonne() <= this.fin.getColonne()) && (n.fin.getColonne() >= this.debut.getColonne()));
	}

	/*
	 * Retourne true si et seulement si this contient c. Dans ce cas, c est ajoutée aux parties
	 * touchées si nécessaire.
	 */
	public boolean recoitTir(Coordonnee c) {
		if (this.contient(c)) {
			// il faut ajouter les valeurs au tableau
			for (int i = 0; i < partiesTouchees.length; i++) {
				// on parcours le tableau pour trouver s'il y a c
				if (partiesTouchees[i] == null) {
					partiesTouchees[i] = c;
					nbTouchees++;
					return true;
				}
			}
			return true;
		}
		else {
			return false; // ok
		}
}


	/*
	 * Retourne true si et seulement si this a été touché par un tir en c.
	 */
	public boolean estTouche(Coordonnee c) {
		// On cherche a savoir si c existe dans partiesTouchees
		for(int i = 0; i < this.nbTouchees; i++) {
			if(this.partiesTouchees[i] != null) 
				if(this.partiesTouchees[i].equals(c))
					return true;
		}
		return false;
	}

	

	/*
	 * Retourne true si et seulement si this a au moins une partie touchée.
	 */
	public boolean estTouche() {
		return (this.nbTouchees > 0);
	}

	/*
	 * Retourne true si et seulement si this est coulé, c'est-à-dire que toutes ses parties ont été touchées. 
	 */
	
	public boolean estCoule() {
		return (this.nbTouchees >= this.partiesTouchees.length);
	}

	
	
	public static void main(String[] args) {
		 

		/*
/////////////// TESTS DE RECOITTIR
		if (test1.recoitTir(touch7) != true) {
			System.out.println("La methode recoitTir a un probleme");
		}
		Coordonnee touch8 = new Coordonnee (3,4); // D3
		Coordonnee touch9 = new Coordonnee (2,1); // B1
		if (test1.recoitTir(touch8) != true) {
			System.out.println("La methode recoitTir a un probleme");
		}
		if (test1.recoitTir(touch9) == true) {
			System.out.println("La methode recoitTir a un probleme");
		}
/////////////// FIN TESTS DE RECOITTIR
/////////////// TESTS DE ESTTOUCHE
		test1.recoitTir(touch7);
		if (test1.estTouche(touch7) != true) {
			System.out.println("La methode estTouche(coordonnees c) a un probleme");
		}
		if (test1.estTouche() != true) {
			System.out.println("La methode estTouche() a un probleme");
		}
/////////////// FIN TESTS DE ESTTOUCHE
/////////////// TESTS DE ESTCOULE
//		Coordonnee touch22 = new Coordonnee(3,3);
//		Coordonnee touch2 = new Coordonnee (3,4);
//		System.out.println(touch2.toString());
//		Coordonnee touch3 = new Coordonnee (3,5);
//		Coordonnee touch4 = new Coordonnee (3,6);
//		Coordonnee touch5 = new Coordonnee (3,7);
//		System.out.println(touch3.toString());
//		test1.recoitTir(touch22);
//		System.out.println("Le bateau recoit le tir : " + test1.recoitTir(touch22));
//		test1.recoitTir(touch2);
//		test1.recoitTir(touch3);
//		test1.recoitTir(touch4);
//		test1.recoitTir(touch5);
//		System.out.println("Coule ? " + test1.estCoule()); // true
/////////////// FIN TESTS DE ESTCOULE
*/
		Coordonnee coordA = new Coordonnee("B2");
		Coordonnee coordA2 = new Coordonnee("C2");
		Coordonnee coordB = new Coordonnee(4,5);
		Coordonnee coordC = new Coordonnee(2,3);

		Coordonnee coordD = new Coordonnee("B2");
		Coordonnee coordE = new Coordonnee("A2");
		Coordonnee coordF = new Coordonnee(3,1);
		
		Navire n = new Navire(coordA, 2, false);
		Navire nav = new Navire(coordE, 4, true);
		Navire nav2 = new Navire(coordF, 4, false);
		
//		System.out.println("navn: "+n.toString());
//		System.out.println("nav2: "+nav2.toString());
		
		System.out.println(n.toString());
//		System.out.println(nav.toString());
//		System.out.println(n.chevauche(nav));
		System.out.println("n(this)  touche  nav(objet): "+n.touche(nav));
		
		System.out.println("n recoit un tir :"+n.recoitTir(coordA));
		System.out.println("est coulé ?"+ n.estCoule());
		System.out.println("n recoit un tir :"+n.recoitTir(coordA2));
		System.out.println("est coulé ?"+ n.estCoule());
//		System.out.println(n.estTouche());
//		System.out.println("F: "+ F.toString());
		
		


	}

}
