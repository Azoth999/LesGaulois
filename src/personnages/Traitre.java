package personnages;

public class Traitre extends Samourai {

	private int traitrise = 0;
	
	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}

	public void ranconner(Commercant commercant) {
		if (this.getTraitrise()<3) {
			int argentRanconner = commercant.getArgent()*2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			traitrise++;
			String texte = "Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne moi "
					+ argentRanconner
					+ " sous ou gare à toi!";
			parler(texte);
			texte = "Tout de suite grand " + this.getNom() + ".";
			commercant.parler(texte);
		}else {
			String texte = "Mince je ne peux plus rançonner personne sinon un samourai risque de me démasquer!";
			parler(texte);
		}
	}
	
	public void faireLeGentil() {
		
	}
	
	public int getTraitrise() {
		return traitrise;
	}
	
	public void direBonjour() {
		super.direBonjour();
		String texte = "J'ai actullement un niveau de traitrise de ";
		texte+=this.getTraitrise() + ".";
		parler(texte);
	}
	
}
