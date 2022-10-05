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
	public int nbVillageois = 0;
	public Gaulois[] population;
	public Chef chef;
	public Village(String nom,int nbVillageoisMaximum, Chef chef) {
		this.nom = nom;
		this.population =population[nbVillageoisMaximum];
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Chef getChef() {
		return chef;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
}
