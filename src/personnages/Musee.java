package personnages;

public class Musee {
	private Trophee[] galerie = new Trophee[200];
	private int nbTrophee;
	
	public void donnerTrophees(Gaulois donateur, Equipement trophee) {
		galerie[nbTrophee]= new Trophee(donateur,trophee);
	}
	
	
	public String extraireInstructionCaml () {
		String texte = "let musee = [";
		for (int i = 0; i<nbTrophee;i++) {
			texte += "\n\"" + galerie[i].getGaulois().getNom() + "\", ";
			texte += "\"" + galerie[i].getEquipement().getEquipement() + "\"";
			if (i!=nbTrophee-1) {
				texte += ";";
			}
		}
		texte += "\n]";
		return texte;
	}
}
