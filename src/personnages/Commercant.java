package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent);
	}

	public void seFaireExtorquer() {
		this.perdreArgent(getArgent());
		String texte = "J'ai tout perdu! Le monde est trop injuste";
		parler(texte);
	}
	
	public void recevoir(int argent) {
		String texte = "";
		texte += argent;
		texte += " sous! Je te remerci généreux donnateur!";
		parler(texte);
		this.gagnerArgent(argent);
	}
		
}
