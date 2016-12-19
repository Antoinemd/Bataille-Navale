package batailleNavale;

public class GrilleNavale {
	private Navire[] navires;
	private int nbNavires;
	private int taille;
	private Coordonnee[] tirsRecus;
	private int nbTirsRecus;

	public GrilleNavale(int taille, int[] taillesNavires) {
		this.taille = taille;
		
		// nb navire = taille du tableau de navires
		this.nbNavires = 0;//taillesNavires.length; 

		// initialisation des tirs reçus à 0
		this.nbTirsRecus = 0; 
		
		// mona: besoin pour methode tirs
		this.tirsRecus = new Coordonnee[taille*taille]; 
		// this.tirsRecus = new Coordonnee[(taille*taille)]; // Nb de coups
		// possible = taille de la grille
		this.navires = new Navire[taillesNavires.length];
	
		
		// commenter si on ne veut pas du placement automatique
		placementAuto(taillesNavires);
	}

	public GrilleNavale(int taille, int nbNavires) {
		this.taille = taille;
		this.navires = new Navire[nbNavires];
		this.nbNavires = 0;
		// mona: besoin pour methode tirs
		this.nbTirsRecus = 0;
		this.tirsRecus = new Coordonnee[taille*taille]; 
		
		
	}
	

	/*
	 * Place automatiquement et aléatoirement taillesNavires.length navires dont les tailles sont données dans
	 * taillesNavire.
	 */
	public void placementAuto(int[] taillesNavires) {

	int i = 0;
	while(i < taillesNavires.length) {
		int nbNaviresInit = this.nbNavires;	// Nomre de navires avant la création d'un nouveau navire qui sera placé aléatoirement
		boolean estVertical = (Math.random() < 0.5);
		Coordonnee c = new Coordonnee((int)(Math.random()*(this.taille + 1 - 1) + 1), (int)(Math.random()*(this.taille + 1 - 1) + 1));
//		Coordonnee c = new Coordonnee((int)(Math.random() * (taille - taillesNavires[i])), (int)(Math.random() * (taille - taillesNavires[i])));
		Navire n = new Navire(c, taillesNavires[i], estVertical);
		this.ajouteNavire(n);
		if(this.nbNavires > nbNaviresInit)
			i++;
		}
	}

	/*
	 * La StringBufer va créer une chaine de caractere contenant les coordonnées pour avoir les infos sur les 
	 * bateaux et formater la grille avec les indices de lignes et de colone et les retour à la ligne
	 * On bufferise des cases en vérifiant leur état.
	 * La coordonnée parcourue est récupérée via les indices de parcourt des boucles for
	 */
	public String toString() {
		
		int coteGrille = this.taille;
		StringBuffer superGrille = new StringBuffer();
		Coordonnee coordCourante = new Coordonnee(0,0);	// <0,0> coordonnée arbitraire
		
		// assurer la capacité de la taille totale de la grille: n*n+(2n+1)
		superGrille.ensureCapacity(coteGrille*coteGrille+(2*coteGrille+1)); 		

		// Décalage des lettres
		superGrille.append(" ");
		
		// Affichage des lettres
		for (int i = 0; i < coteGrille; i++) {
			char c = (char) (i + 'A');
			superGrille.append("\t"+c);
		}
		
		
		for (int ligneParc = 0; ligneParc < coteGrille; ligneParc++) {
			// retour chariot + N°ligne
			superGrille.append("\n"+(ligneParc+1));
				
			for (int colParc = 0; colParc < coteGrille; colParc++) {
				boolean dejaTire = false;
				coordCourante = new Coordonnee(ligneParc+1, colParc+1);
				
				// TirRecu ? ->  oui
				if(estDansTirsRecus(coordCourante)){
					if (estALEau(coordCourante)) {
						dejaTire = true;
						superGrille.append("\to");	
						
					}else if(estTouche(coordCourante)){
						dejaTire = true;
						superGrille.append("\tX");
					}
				// TirRecu ? -> non
				} else {
					// Sinon si on est pas dans tirReçu  
					for (int i = 0; i < nbNavires; i++) {
						// On parcourt le tableau des coorodnnées des bateaux
						if(navires[i].contient(coordCourante) && dejaTire == false){
							dejaTire = true;
							superGrille.append("\t#");
							break;
							}
					}
					
					if(dejaTire==false){
						superGrille.append("\t.");
					}
				}
			} // end for colParc
		}	// end for ligneParc
		
		String s = superGrille+"";
		return s;
	}
	
	public boolean ajouteNavire(Navire n) {
		
		if (!estDansGrille(n.getDebut()) || !estDansGrille(n.getFin())) {
			System.out.println("ajouteNavire(): Coordonnée de deb ou de fin en dehors de la grille");
			return false;
		}
		
		if(navires.length == nbNavires){
			System.out.println("ajouteNavire(): Le tableau de bateaux est plein");
			return false;
		}
			
		if(this.nbNavires==0){
			this.navires[0]=n;
			this.nbNavires+=1;
		}else{
			
			for (int i = 0; i < this.nbNavires; i++) { 
				System.out.println("nBnavires: "+ nbNavires);
				System.out.println("navires: "+ navires[i]);
				if((this.navires[i].chevauche(n) || this.navires[i].touche(n))){
					System.out.println("ajouteNavire(): Erreur de coordonnées: 2 navires se touchent/chevauchent !");
					return false;
				}
			}
			System.out.println(navires[nbNavires] = n);
			System.out.println(nbNavires++);
		}
	return true;
		
	}

	/*
	 *  methode OK
	 */
	private boolean estDansGrille(Coordonnee c) {
		return ((c.getLigne() <= taille) && (c.getColonne() <= taille) && 
				(c.getLigne() > 0) && (c.getColonne() > 0)); //ligne >0 et colone >0
	}
	

	private boolean estDansTirsRecus(Coordonnee c) {
		for (int i = 0; i < nbTirsRecus; i++) {
			if (estDansGrille(c) && (c.equals(this.tirsRecus[i]))) {
				return true;
			}
		}
		return false;
	}
	
	
	private boolean ajouteDansTirsRecus(Coordonnee c) {
		
		if (!estDansTirsRecus(c)) {		
			this.tirsRecus[nbTirsRecus] = c;
			nbTirsRecus+=1;
			return true; // this est modifié, on renvoie true
		}
			return false;
	}
	

	/*
	 * Ajoute c aux tirs reçus de this si nécessaire. Retourne true si et seulement si c ne
	 * correspondait pas déjà à un tir reçu et a permis de toucher un navire de  this.
	 */
	public boolean recoitTir(Coordonnee c) {
		
		//On verifie si un tir n'a pas déja été effectué a ces coordonnées
		//if(estDansTirsRecus(c))throw new IllegalArgumentException("Tir déjà effectué à cette coordonnee");
		if(!estDansGrille(c))throw new IllegalArgumentException("Tir en dohors de la grille");
		
		if (this.estDansTirsRecus(c)){
			System.out.println("On a déjà tiré içi !");
			return false;
		}
		
		// On l'ajoute
		this.ajouteDansTirsRecus(c);
		
		// Si le tir reçu permet de toucher un bateau
		for (int i = 0; i < this.nbNavires; i++) {
			if (this.navires[i].recoitTir(c))
				return true;
		}
		return false; 
	}
	
	
	/*
	 * Retourne true si et seulement si un des navires présents dans this a été touché en c.
	 */
	public boolean estTouche(Coordonnee c) {

		for (int i = 0; i < nbNavires; i++) {
			if ((navires[i].estTouche(c))) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean estALEau(Coordonnee c) { // en cours
		return (!this.estTouche(c));
	}

	public boolean estCoule(Coordonnee c) {
		
		if(this.estTouche(c)) {
			for(int i = 0; i < this.nbNavires; i++)
				if(this.navires[i].estCoule())
					return true;
		}
			return false;
}
	
	
	public boolean perdu() {
		for(int i = 0; i < this.nbNavires; i++){
			if(!this.navires[i].estCoule())
				return false;
			//renvoie vrai si tous les bateaux de navires sont coules
		}
		return true;
}
	
	
	public static void main(String[] args) {
		

		System.out.println("PARTIE TEST DU BRO-GRAMMEUR");

		Coordonnee coorTirSurBro = new Coordonnee("C2");
		Coordonnee horsGrille = new Coordonnee("F1"); //F1
		Coordonnee coorBro = new Coordonnee("B2");
		Coordonnee coorBro2 = new Coordonnee("A3"); //B3
		Coordonnee coorBro3 = new Coordonnee(4,3); //D3
		
		Coordonnee videTouche = new Coordonnee("C1"); // C1
		Coordonnee tirSurBro = new Coordonnee("C2");
		
		Navire nav1 = new Navire(coorBro, 2, false);
		Navire nav2 = new Navire(coorBro2, 3, true);
		
		int [] tabTaillesNaviresBro = {2};
//		GrilleNavale grilleBro = new GrilleNavale(5, tabTaillesNaviresBro); // Constructeur 1
		GrilleNavale grilleBro2 = new GrilleNavale(5, 1);					// Constructeur 2


		
//		System.out.println("la coordonnée estDansGrille? " + grilleBro.estDansGrille(horsGrille)+"\n");
		System.out.println("la coordonnée estDansGrille? " + grilleBro2.estDansGrille(coorBro)+"\n");
		
		
		System.out.println("Tir sur une case vide: "+grilleBro2.recoitTir(videTouche));
		System.out.println("Tir sur une case vide N2: "+grilleBro2.recoitTir(videTouche));
		
//		
		
		System.out.println("on ajoute un navire: " + grilleBro2.ajouteNavire(nav1)+"\n");
		System.out.println("on ajoute un navire: " + grilleBro2.ajouteNavire(nav2)+"\n");
		
		System.out.println("Tir sur une case vide N2: "+grilleBro2.recoitTir(coorBro));
		System.out.println("on tir sur le bateau en C2: "+ grilleBro2.recoitTir(coorTirSurBro)+"\n");
		
		
//		System.out.println(grilleBro.toString()+"\n");
		System.out.println(grilleBro2.toString()+"\n");
		
		System.out.println("Perdu? :"+ grilleBro2.perdu());
		
		System.out.println();
//		System.out.println(" /*****************************************/ ");
				

	}
}