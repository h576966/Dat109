package no.hvl.dat109;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceTest {

	@Test
	void testDie() {
		for (int i= 0; i<190; i++) {
			int a = Dice.rollDie();
			System.out.println(a);
			assertTrue((a>=1) && (a<19) && (a!=6) && (a!=12));
		}
		
	}

}
