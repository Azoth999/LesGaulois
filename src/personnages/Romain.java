/**
 * 
 */
package personnages;

/**
 * @author prn3318a
 *
 */
public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
		this.equipement=new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int forceInit = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force<forceInit;
	}
	
	public String sEquiper(Equipement equipement) {
		String texte = "Le soldat ";
		texte+=this.getNom();
		switch (nbEquipement) {
		case 2: {
			texte+= " est déjà bien protégé!";
			return texte;
		}
		case 1: if (this.equipement[0]==equipement) {
			return
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + nbEquipement);
		}
	}
	
	public static void main(String[] args) {
		Romain romain = new Romain("Minus", 6);
		System.out.println(romain.prendreParole());
		romain.parler("Je vais te d�truire!");
		romain.recevoirCoup(4);
		romain.recevoirCoup(5);
	}
}
