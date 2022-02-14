package Objekt;


public class Boost {

	private Spiller spiller;
	private Brett brett;
	
	
	
	public Boost() {
		this.spiller = spiller;
		this.brett = brett;
	}


	public void slangeStige(Spiller spiller) {
		
		switch (spiller.getSpillerPos()) {
		
		//slanger
		//26 --> 10
		case 26:
			spiller.setSpillerPos(10);
			System.out.println(spiller.getNavn() + " slange ned til " + spiller.getSpillerPos());
			System.out.println();
			break;
		//15 --> 5
		case 15:
			spiller.setSpillerPos(5);
			System.out.println(spiller.getNavn() + " slange ned til " + spiller.getSpillerPos());
			System.out.println();
			break;
		
		//stiger
		//12 --> 20
		case 12:
			spiller.setSpillerPos(20);
			System.out.println(spiller.getNavn() + " stige opp til " + spiller.getSpillerPos());
			System.out.println();
			break;
		//8 --> 11
		case 8: 
			spiller.setSpillerPos(11);
			System.out.println(spiller.getNavn() + " stige opp til " + spiller.getSpillerPos());
			System.out.println();
		
		 
		}	
		
	}
	
}
	
	
	

