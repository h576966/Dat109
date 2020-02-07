package no.hvl.dat109;

import java.util.Random;

public class Dice {
	private int value;

	public Dice(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

//	public static int rollDie() {
//		Random random = new Random();
//		// Obtain a number between [0 - 5] then add 1.
//		int value= random.nextInt(6) + 1;
//		if (value > 17) {
//			// set player.setPosition(1);
//			// System.out.println("You're going too fast, the gods slows you down. Start
//			// from scratch!");
//			return 0;
//		}
//		if (value == 6 || value == 12) {
//			value += rollDie();
//		}
//
//		return value;
//
//	}
	
	public static int rollDie() {
		Random random = new Random();
		int value = 0;
		
		while (value==0 || value==6 || value==12) {
			value+=random.nextInt(6)+1;
				
		}
		return value;
	}

}
