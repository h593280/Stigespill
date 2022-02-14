package Objekt;

public class Brett  {

	private Rute [] ruter;
	
	public Brett() {
		ruter = new Rute[100];
	
	for(int i = 0; i <= 99; i++) {
		ruter[i] = new Rute(i);
	}
	
	}

	public Rute[] getRuter() {
		return ruter;
	}

	public void setRuter(Rute[] ruter) {
		this.ruter = ruter;
	}
	
	
	
}
