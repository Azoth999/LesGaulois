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

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
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
	
	public static void main(String[] args) {
		Romain romain = new Romain("Minus", 6);
		System.out.println(romain.prendreParole());
		romain.parler("Je vais te d�truire!");
		romain.recevoirCoup(4);
		romain.recevoirCoup(5);
	}
}
