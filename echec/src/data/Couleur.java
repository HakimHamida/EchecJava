package data;

public enum Couleur {
	BLACK("BLACK"), WHITE("WHITE");

	Couleur(String s) {
		description = s;
	}

	private final String description;

	public String getDescription() {
		return description;
	}

}
