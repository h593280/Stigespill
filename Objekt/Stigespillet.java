package Objekt;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stigespillet {

	private Spiller [] spillerTab;
	private Brett brett;
	private Terning terning;
	private Boost boost;
	private int counter;
	
	public Stigespillet(Spiller [] spillerTab) {
	  this.spillerTab = spillerTab;
		this.terning = new Terning();
		this.brett = new Brett();
		this.boost = new Boost();
		counter = 0;
	}
	
	
	public void spilleTrekk(Spiller spiller) {
		terning.trill();
		int terningVerdi = terning.getTerningTrill();
		if(!(spiller.getSpillerPos() + terningVerdi > 100)) {
			spiller.flyttSpiller(terningVerdi);
		}
					
		
	}	
	
	
	public boolean harSpillerVunnet(Spiller spiller) {
		
		if(spiller.getSpillerPos() > 99) {
	
			return true;
		}
	
		
		return false;
	}
	
	
	public void spill() {
	
		boolean gameover = false;
		
		
		for (int i = 0; i < 40; i++) {
			if(!gameover) {
			
				for(int j = 0; j < spillerTab.length; j++) {
					
					spilleTrekk(spillerTab[j]);
					boost.slangeStige(spillerTab[j]);
					
					
					if(!harSpillerVunnet(spillerTab[j])){
					
						System.out.println("Spiller: " + spillerTab[j].getNavn() + "\n" + "Brikke: "
				                + spillerTab[j].getBrikke() + "\n" + "Rute: " + spillerTab[j].getSpillerPos());
				        System.out.println();
						
					} else {
					
						System.out.println("Spiller: " + spillerTab[j].getNavn() + "\n" + "Brikke: "
			                    + spillerTab[j].getBrikke() + "\n" + "Rute: " + spillerTab[j].getSpillerPos());
			            System.out.println();
			            System.out.println(spillerTab[j].getNavn() + " Har vunnet!");
						
				    gameover = true;
		            
					break;
					
					}	
				
			}
		}
			
		}
	}

}
	

	
	

	
	
	

