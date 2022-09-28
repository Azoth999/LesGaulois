/**
 * 
 */
package personnages;
import java.util.Random;

/**
 * @author prn3318a
 *
 */
public class Druide {
	private String nom;
	private int forcePotion =1;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force "
				+ effetPotionMin + " � "
				+ effetPotionMax + ".");
	}
	
	public void preparerPotion() {
		Random rand = new Random();
		this.forcePotion = rand.nextInt(effetPotionMin, effetPotionMax);
		if (forcePotion > 7) {
			parler("J'ai pr�par� une super potion de force " + forcePotion);
		}else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force "
					+ forcePotion);
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obelix")) {
			System.out.println("Non, Ob�lix !... Tu n’auras pas de potion magique !");
		}else {
			preparerPotion();
			gaulois.boirePotion(this.forcePotion);
		}
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}
