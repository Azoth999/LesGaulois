package personnages;
import java.util.Random;
import java.util.random.*;

public class Traitre extends Samourai {

	private int traitrise = 0;
	Random random = new Random();
	
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
		String texte;
		if(this.getNbrConnaissances()<1) {
			texte="Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.";
			parler(texte);
		}else {
			int don = this.getArgent()*1/20;
			Humain ami=this.getMemoire()[random.nextInt(0,getNbrConnaissances())];
			String nomAmi=ami.getNom();
			texte = "Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "
					+ nomAmi + ".";
			parler(texte);
			texte = "Bonjour l'ami! Je voudrais vous aider en vous donnant " 
					+ don 
					+ " sous." ;
			parler(texte);
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			texte="Merci " + this.getNom() + ". Vous êtes quelqu'un de bien.";
			ami.parler(texte);
			if(traitrise>=1) {
				this.traitrise--;
			}else {
				texte="Mince c'était inutile, j'avais déjà un niveau de traitrise de 0!";
				parler(texte);
			}
		}
	}
	
	public int getTraitrise() {
		return traitrise;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte = "Mais je suis un traître et mon niveau de traîtrise est : "
				+ this.getTraitrise()
				+ ". Chut!";
		parler(texte);
	}
	
}
