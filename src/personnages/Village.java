/**
 * 
 */
package personnages;

/**
 * @author Yanis
 *
 */
public class Village {
	public String nom;
	public Gaulois[] population;
	public Chef chef;
	public Village(String nom, Chef chef, Gaulois[] population) {
		this.nom = nom;
		this.population = population;
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	public Chef getChef() {
		return chef;
	}
	
}
