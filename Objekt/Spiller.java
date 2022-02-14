package Objekt;



public class Spiller {

	private String navn;
	private int spillerPos;
	private String brikke; 
	
	public Spiller() {}
	
	public Spiller(String navn, String brikke) {
		this.navn = navn;
		this.brikke = brikke;
		this.spillerPos = 1;
	}


	public void flyttSpiller (int terningVerdi) {
		spillerPos += terningVerdi;
		setSpillerPos(spillerPos);
	}
	

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getSpillerPos() {
		return spillerPos;
	}

	public void setSpillerPos(int spillerPos) {
		this.spillerPos = spillerPos;
	}

	public String getBrikke() {
		return brikke;
	}

	public void setBrikke(String brikke) {
		this.brikke = brikke;
	}

	public String getStatus() {
		return navn + " er på rute " + spillerPos;
	}
	
	
}
