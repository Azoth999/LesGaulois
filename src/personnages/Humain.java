package personnages;

public class Humain {

	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom,String boisson, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public int getArgent() {
		return argent;
	}
	
	public String prendreParole() {
		return "L'humain " + this.getNom() + " : ";
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	public void direBonjour() {
		String texte = "Bonjour! Je m'appelle ";
		texte += this.getNom();
		texte += " et j'aime boire du ";
		texte += this.getBoisson() + ".";
		parler(texte);
	}
	
	public void boire() {
		String texte = "Mmm, un bon verre de ";
		texte += this.getBoisson();
		texte += "! GLOUPS!";
		parler(texte);
	}
	
	public void acheter(String bien, int prix) {
		String texte = "";
		if (this.getArgent()>=prix) {
			texte += "J'ai ";
			texte += this.getArgent();
			texte += " sous en poche. Je vais pouvoir m'offrir ";
			texte += bien;
			texte += " à ";
			texte += prix;
			texte += " sous.";
			perdreArgent(prix);
		}else {
			texte += "Je n'ai plus que ";
			texte += this.getArgent();
			texte += " sous en poche. Je ne peux même pas m'offrir ";
			texte += bien;
			texte += " à ";
			texte += prix;
			texte += " sous.";
		}
		this.parler(texte);
	}
	
	public void gagnerArgent(int gain) {
		this.argent = this.getArgent() + gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent = this.getArgent() - perte;
	}

}