package personnages;

import java.util.Iterator;
import java.util.Random;

public class GrandMere extends Humain {


	private Random random = new Random();
	private enum TypeHumain {
		RONIN,
		SAMOURAI,
		YAKUZA,
		COMMERCANT,
		HABITANT,
		GRANDMERE
	};
	
	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
		MAX_MEMOIRE = 5;
	}
	
	@Override
	protected void memoriser(Humain humain) {
		if (getNbrConnaissances()+1 > MAX_MEMOIRE){
			String texte = "Oh ma tête! Je ne peux plus retenir le nom d'une personne sipplémentaire!";
			parler(texte);
		} else {
			memoire[getNbrConnaissances()]=humain;
			setNbrConnaissances(getNbrConnaissances()+1);
		}
	}
	
	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		return types[random.nextInt(0,types.length-1)].name();
	}
	
	public void ragoter() {
		String texte;
		for (int i=0;i<getNbrConnaissances();i++) {
			texte ="Je crois que "+memoire[i].getNom();
			if (memoire[i] instanceof Traitre) {
				texte+=" est un traitre. Petit chenapant!";
				parler(texte);
			}else {
				texte+=" est un " +humainHasard()+".";
				parler(texte);
			}
		}
	}
	
}
