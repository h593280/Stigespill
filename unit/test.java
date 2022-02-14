package unit;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Objekt.Boost;
import Objekt.Brett;
import Objekt.Spiller;
import Objekt.Stigespillet;
import Objekt.Terning;


class test {

	private Spiller spiller1;
	private Spiller spiller2;
	private Spiller [] spillerTab;
	private Stigespillet stigespillet;
	private Brett brett;
	private Terning terning;
	private Boost boost;
	
	
	//assertEquals(expected, actual)
	
	@BeforeEach
	public void setUp() {
		
		brett = new Brett();
		terning = new Terning();
		spiller1 = new Spiller("Anton", "Blå");
		spiller2 = new Spiller("Vlad", "Hvit");
		spillerTab = new Spiller[] {spiller1};
		stigespillet = new Stigespillet(spillerTab);
		boost = new Boost();
		
	}
	
	
	
	@Test
	void terningVerdi() {
		terning.trill();
		assertTrue(Arrays.asList(1,2,3,4,5,6).contains(terning.getTerningTrill()));
	}
	
	@Test 
	void brettStorrelseOgSpillerStartPosisjon() {
		
		assertEquals(100, brett.getRuter().length);
		
		assertEquals(1, spiller1.getSpillerPos());
	}
	
	
	@Test
	void spillMedToSpillere() {
	
	spiller1.setSpillerPos(100);
	spiller2.setSpillerPos(99);
	
	assertTrue(stigespillet.harSpillerVunnet(spiller1));
	assertFalse(stigespillet.harSpillerVunnet(spiller2));
		
	}
	
	
	
	@Test 
	void slangerOgStiger() {
		
		spiller1.setSpillerPos(26);
		boost.slangeStige(spiller1);
		assertEquals(10, spiller1.getSpillerPos());
		
		
		spiller2.setSpillerPos(12);
		boost.slangeStige(spiller2);
		assertEquals(20, spiller2.getSpillerPos());
		
	}
	
	

}
