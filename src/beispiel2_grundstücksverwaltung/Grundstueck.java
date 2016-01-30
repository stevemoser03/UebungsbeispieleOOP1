package beispiel2_grundstücksverwaltung;

public class Grundstueck {

	private String inhaber;
	
	private int länge;
	
	private int breite;

public Grundstueck(int länge, int breite, String inhaber) {
	this.länge = länge;
	this.breite = breite;
	this.inhaber = inhaber;
}

public String getInhaber() {
	return inhaber;
}

public void setInhaber(String inhaber) {
	this.inhaber = inhaber;
}

public int getLänge() {
	return länge;
}

public void setLänge(int länge) {
	this.länge = länge;
}

public int getBreite() {
	return breite;
}

public void setBreite(int breite) {
	this.breite = breite;
}

public int getFlaeche(){
	
	int flaeche = länge*breite;
	return flaeche;
}
	
}
