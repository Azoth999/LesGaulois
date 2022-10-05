package personnages;

public enum Equipement {
	CASQUE("Casque"),
	BOUCLIER("Bouclier");
	private final String equipement;
	
	private Equipement(String equipement) {
		this.equipement = equipement;
	}
	
	private String toString() {
		return this.equipement;
	}
	
}
