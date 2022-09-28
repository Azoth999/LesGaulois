/**
 * 
 */
package personnages;

/**
 * @author PEYRAT Yanis
 *
 */
public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "Â« " + texte + "Â»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mÃ¢choire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
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
