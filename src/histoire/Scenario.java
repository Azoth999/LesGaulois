/**
 * 
 */
package histoire;
import personnages.*;

/**
 * @author PEYRAT Yanis
 *
 */
public class Scenario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Ob�lix",8);
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Romain minus = new Romain("Minus",5);
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
