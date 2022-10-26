/**
 * 
 */
package personnages;

/**
 * @author Yanis
 *
 */
public class Chef extends Humain {
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Chef(String nom, int force, Village village,String boisson, int argent) {
		super(nom,boisson,argent);
		this.force = force;
		this.village = village;
		this.village.setChef(this);
	}

	public void setVillage(Village village) {
		this.village = village;
	}
	public Village getVillage() {
		return village;
	}
	
	@Override
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	@Override
	public String prendreParole() {
		return "Le chef " + this.getNom() + " du village " + getVillage().getNom() + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(this.getNom() + " envoie un grand coup dans la m�choire de " +
			romain.getNom());
		romain.recevoirCoup(force / 3);
	}
}
