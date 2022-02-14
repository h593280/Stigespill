package Objekt;

import java.util.Random;



public class Terning {

	private int terningTrill;

	public Terning() {
		terningTrill = 0;
	}
	
	
	public int getTerningTrill() {
		return terningTrill;
	}



	public void setTerningTrill(int terningTrill) {
		this.terningTrill = terningTrill;
	}



	//Triller terning og returnerer verdien
	public void trill() {
	terningTrill = (int) (Math.random() * 6 + 1);
	}
	
	
}

