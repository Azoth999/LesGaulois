package personnages;

public enum Equipement {
	CASQUE("casque"),
	BOUCLIER("bouclier");
	private final String equipements;
	
	private Equipement(String equipement) {
		this.equipements = equipement;
	}
	
	public String getEquipement() {
		return equipements;
	}
	
	@Override
	public String toString() {
		return "[equipement = " + equipements + "]";
	}
	
}
