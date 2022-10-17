/**
 * 
 */
package personnages;

/**
 * @author PEYRAT Yanis
 *
 */
public class Gaulois {
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	//attributs ajoutés pour TP3
	private String nom;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	//
	//méthode ajoutée pour TP3
	//
	
	private String prendreParole() {
		return "Le gaulois " + this.nom + " : ";
		}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}

	
	//
	//méthode ajoutée pour TP3
	//
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesObtenus= romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesObtenus != null && i < tropheesObtenus.length 
				&& tropheesObtenus[i] != null ; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesObtenus[i];
		}
	}

	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3);
//	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "
				+ forcePotion 
				+ " fois décuplée.");		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void faireUneDonnation(Musee musee) {
		if (trophees != null) {
			String texte = "Je donne au musee tout mes trophees :";
			for (int i=0; i<nbTrophees; i++) {
				texte += "\n-" + trophees[i].getEquipement();
			}
			this.parler(texte);
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain romain = new Romain("Romain", 5);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Salutation voyageur!");
		asterix.boirePotion(6);
		asterix.frapper(romain);
	}
}
