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
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.population =new Gaulois[nbVillageoisMaximum];
		this.chef.setVillage(this);
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
	
	public void ajouterHabitant(Gaulois habitant) {
		if (this.nbVillageois<this.population.length) {
			this.population[this.nbVillageois]=habitant;
			this.nbVillageois++;
		}else {
			System.err.println("Le vilalge est plein, il n'y a plus de place!");
		}
	}
	
	public Gaulois trouverHabitant(int numero) {
		return this.population[numero];
	}
	
	public void afficherVillageois() {
		String texte = "Dans le village du chef ";
		texte += getChef().getNom();
		texte += " vivent les légendaires gaulois :";
		for (int i = 0; i < nbVillageois; i++) {
			texte += "\n - ";
			texte += this.population[i].getNom();
		}
		System.out.println(texte);
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		Chef chef = new Chef("Abraracourcix", 6,village);
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		/*
		 *Gaulois gaulois = village.trouverHabitant(30);
		 *On obtiens un message OutOfBounds car la liste est de taille 30
		 *et n'a donc des valeurs que jusqu'a l'index 29.
		*/
		/*
		 *Gaulois gaulois = village.trouverHabitant(1);
		 *System.out.println(gaulois);
		 *On obtiens null car il n'y a pas d'élément inscrit à l'index 1
		 *de la liste soit un élément innexistant (null)
		*/
		village.afficherVillageois();
	}
}
