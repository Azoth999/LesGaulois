package personnages;

public class Yakuza extends Humain {

	private int reputation;
	private String clan;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public String getClan() {
		return clan;
	}
	
	public void extorquer(Commercant victime) {
		int sous = victime.getArgent();
		String texte = "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?";
		parler(texte);
		texte = victime.getNom();
		texte += ", si tu tiens à la vie donne moi ta bourse!";
		parler(texte);
		victime.seFaireExtorquer();
		this.gagnerArgent(sous);
		texte = "J'ai piqué les ";
		texte += sous;
		texte += " de ";
		texte += victime.getNom();
		texte += " ce qui me fait ";
		texte += this.getArgent();
		texte += " sous dans ma poche. Hi! Hi!";
		parler(texte);
		
		}
}
