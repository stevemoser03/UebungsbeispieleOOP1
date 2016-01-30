package beispiel1_gehaltskonten;

public class Gehaltskonto {

	private String inhaber;
	
	private String iban;
	
	private String bic;
	
	private double kontostand = 0.0;

	public Gehaltskonto(String inhaber, String iban, String bic) {
		this.inhaber = inhaber;
		this.iban = iban;
		this.bic = bic;
		this.kontostand = kontostand;
	}
	
	public void aufbuchen(double wert){
		 kontostand += wert;
	}
	
	public void abbuchen(double wert){
		if(kontostand-wert>0.0){
			 kontostand -= wert;
		}
		else System.out.println("Überziehung nicht möglich");
	}
	
	public double getKontostand() {
		return kontostand;
	}
	
}
