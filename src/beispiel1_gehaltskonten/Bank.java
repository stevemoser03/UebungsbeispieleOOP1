package beispiel1_gehaltskonten;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gehaltskonto stefan = new Gehaltskonto("Stefan Moser","AT564400700050118757","VBOEATGRWW");
		
		stefan.aufbuchen(300);
		stefan.abbuchen(50);
		stefan.abbuchen(350);
		System.out.println(stefan.getKontostand());
		stefan.abbuchen(200);
		System.out.println(stefan.getKontostand());
		
		
	}

}
