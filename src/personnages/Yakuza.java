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
		this.reputation++;
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

	public void perdre() {
		String texte = "J'ai perdu mon duel et mes ";
		texte += this.getArgent();
		texte += " sous, snif... J'ai déshonoré le clan de ";
		texte += this.getClan();
		texte += ".";
		parler(texte);
		this.perdreArgent(getArgent());
		if (reputation != 0) {
			this.reputation--;
		}
	}
	
	public void gagner(Ronin ronin) {
		String texte = "Ce ronin pensait vraiment battre ";
		texte += this.getNom();
		texte += " du clan de ";
		texte += this.getClan();
		texte += "? Je l'ai dépouillé de ses ";
		texte += ronin.getArgent();
		texte += " sous.";
		parler(texte);
		reputation++;
		ronin.perdreArgent(getArgent());
	}
}
