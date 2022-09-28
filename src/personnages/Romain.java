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
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public static void main(String[] args) {
		Romain romain = new Romain("Romain", 5);
		System.out.println(romain.prendreParole());
		romain.parler("Je vais te d�truire!");
		romain.recevoirCoup(4);
		romain.recevoirCoup(5);
	}
}
