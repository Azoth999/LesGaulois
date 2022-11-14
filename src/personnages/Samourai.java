package personnages;

public class Samourai extends Ronin{

	private String seigneur;
	
	public Samourai(String seigneur, String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte = "Je suis fier de servir le seigneur ";
		texte+=this.getSeigneur() +".";
		parler(texte);
	}
	
	public void boire(String boisson) {
		String texte="Qu'est-ce que je vais choissir comme boisson?"
				+ " Tiens je vais prendre du ";
		texte+=boisson + ".";
		parler(texte);
	}
	
}
