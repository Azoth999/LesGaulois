package personnages;

public class Humain {

	private String nom;
	private String boisson;
	private int argent;
	private int nbrconnaissances = 0;
	private Humain[] memoire;

	public Humain(String nom,String boisson, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
		this.memoire = new Humain[30];
	}
	
	
	public void memoriser(Humain humain) {
		if (nbrconnaissances+1 > 30){
			for (int i = 0; i <= nbrconnaissances-1; i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[30]=humain;
		} else {
			memoire[nbrconnaissances]=humain;
			nbrconnaissances++;
		}
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		String texte = "Le ";
		texte+=this.getClass().getSimpleName() + " ";
		texte+=this.getNom();
		texte += " rencontre ";
		if (this.getClass() == humain.getClass()) {
			texte+="un autre ";
		}else {
			texte+="le ";
		}
		texte += humain.getClass().getSimpleName()+".";
		System.out.println(texte);
		direBonjour();
		humain.direBonjour();
		humain.memoriser(this);
		memoriser(humain);
		
	}
	
	public void listerConnaissance() {
		String texte = "Je connais beaucoup de monde dont : ";
		for (int i = 0; i < nbrconnaissances; i++) {
			texte = texte + memoire[i].getNom() + ",";
		}
		texte+=memoire[nbrconnaissances] + ".";
		parler(texte);
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
	
	protected String prendreParole() {
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