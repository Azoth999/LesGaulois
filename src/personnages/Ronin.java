package personnages;

public class Ronin extends Humain {

	private int honneur;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur=1;
	}
	
	public void donner(Commercant beneficiaire) {
		int sous = this.getArgent()/10;
		String texte = beneficiaire.getNom();
		texte += " prends ces ";
		texte += sous;
		texte += " sous.";
		parler(texte);
		beneficiaire.recevoir(sous);
		this.perdreArgent(sous);
	}

}
