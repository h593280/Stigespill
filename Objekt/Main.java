package Objekt;


public class Main {

	
	
	public static void main(String[] args) {

	
		Spiller spiller1 = new Spiller("Alfred", "Blå");
		Spiller spiller2 = new Spiller("Bjørn", "Rosa");

		
		Spiller [] spillerTab = new Spiller[] {spiller1, spiller2};
		
		Stigespillet stigespill = new Stigespillet(spillerTab);
	
		stigespill.spill();
	}

}
