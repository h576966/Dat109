package no.hvl.dat109;

import javax.swing.JOptionPane;

public class Start {
	private static int noOfPlayas;
	private static String names;

	public static void main(String[] args) {
		noOfPlayas=(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of players(2-4): ")));
		while(noOfPlayas<2 || noOfPlayas>4) {
			noOfPlayas=(Integer.parseInt(JOptionPane.showInputDialog(null, "A game must have between 2 and 4 Players: ")));
		}
		
		Player[] players= new Player[noOfPlayas];
		for (int i= 1; i<=noOfPlayas; i++) {
			names=JOptionPane.showInputDialog("Enter player name:");
			Player player = new Player(names, 0);
			players[i-1]=player;
			System.out.println(players[i-1]);
			
		}

	}

	
	
}
