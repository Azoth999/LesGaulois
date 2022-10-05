package personnages;

public enum Equipement {
	CASQUE("Casque"),
	BOUCLIER("Bouclier");
	private final String equipement;
	
	private Equipement(String equipement) {
		this.equipement = equipement;
	}
	
	public String getEquipement() {
		return equipement;
	}
	
	@Override
	public String toString() {
		return "[equipement = " + equipement + "]";
	}
	
}
