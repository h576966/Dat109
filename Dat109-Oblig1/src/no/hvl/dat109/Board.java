package no.hvl.dat109;

public class Board {
	// array between 0-99, the positions in the array
	// has an integer value that represents the number of 
	// steps added or deducted when landing on that 
	// position on the board.
	private final int[] board= new int[]{ 	
			0,36,0,10,0,0,0,23,0,0, 
			0,0,0,0,0,-10,0,0,0,0,	
			21,0,0,0,0,0,0,56,0,0,	
			0,0,0,0,0,8,0,0,0,0,	
			0,0,0,0,0,0,-21,0,-38,0,
			16,0,0,0,0,-3,0,0,0,0,
			0,-44,0,-4,0,0,0,0,0,0,
			20,0,0,0,0,0,0,0,0,20,
			0,0,0,0,0,0,-63,0,0,0,
			0,-19,0,0,-20,0,0,-20,0,0
			};
	
	

	public int[] getBoard() {
		return board;
	}
	
}
