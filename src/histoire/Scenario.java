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
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Romain minus = new Romain("Minus",5);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
