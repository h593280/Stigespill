package Objekt;


public class Main {

	
	
	public static void main(String[] args) {

	
		Spiller spiller1 = new Spiller("Alfred", "Bl�");
		Spiller spiller2 = new Spiller("Bj�rn", "Rosa");

		
		Spiller [] spillerTab = new Spiller[] {spiller1, spiller2};
		
		Stigespillet stigespill = new Stigespillet(spillerTab);
	
		stigespill.spill();
	}

}
