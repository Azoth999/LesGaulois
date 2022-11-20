package personnages;

public class Humain {

	protected static int MAX_MEMOIRE;
	private String nom;
	private String boisson;
	private int argent;
	private int nbrConnaissances = 0;
	protected Humain[] memoire;

	public Humain(String nom,String boisson, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
		MAX_MEMOIRE=30;
		this.memoire = new Humain[MAX_MEMOIRE];
	}
	
	
	protected void memoriser(Humain humain) {
		if (nbrConnaissances+1 > MAX_MEMOIRE){
			for (int i = 0; i < nbrConnaissances-1; i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[MAX_MEMOIRE-1]=humain;
		} else {
			memoire[nbrConnaissances]=humain;
			nbrConnaissances++;
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
		this.memoriser(humain);
		
	}
	
	public void listerConnaissance() {
		String texte = "Je connais beaucoup de monde dont : ";
		for (int i = 0; i < nbrConnaissances-1; i++) {
			texte = texte + memoire[i].getNom() + ",";
		}
		texte+=memoire[nbrConnaissances-1].getNom() + ".";
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
	
	public int getNbrConnaissances() {
		return nbrConnaissances;
	}
	public void setNbrConnaissances(int nbrConnaissances) {
		this.nbrConnaissances = nbrConnaissances;
	}
	
	public Humain[] getMemoire() {
		return memoire;
	}
	
	protected String prendreParole() {
		return "(" + this.getNom() + ") - ";
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