package beispiel2_grundstücksverwaltung;

public class Gemeinde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grundstueck stefan = new Grundstueck(100, 200, "Stefan Moser");
		Grundstueck mia = new Grundstueck(20, 10, "Mia-Sophie Moser");
		Grundstueck lina = new Grundstueck(50, 10, "Lina Moser");
		
		Grundstueck[] grundstuecke = new Grundstueck[3];
		
		grundstuecke [0] = stefan;
		grundstuecke [1] = mia;
		grundstuecke [2] = lina;
		
		for(int x = 0; x < grundstuecke.length; x++){
			if(grundstuecke[x].getFlaeche()>1000){
				System.out.println("Der Name des Grundstückinhabers lautet: "+grundstuecke[x].getInhaber());
			}
		}
	}

}
