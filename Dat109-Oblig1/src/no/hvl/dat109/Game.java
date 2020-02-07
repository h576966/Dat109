package no.hvl.dat109;

import java.util.Arrays;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Game {
private int noOfPlayers;
private Player[] players;




//public void noOfPlayers(int nOP) {
//	if (nOP<2 || nOP>4) {
//		setGame(nOP);
//	}else {
//		setGame(1);
//	}
//}

public Game(int noOfPlayers) {
	this.noOfPlayers = noOfPlayers;
	Player[] game = new Player[noOfPlayers];
}


public int getNoOfPlayers() {
	return noOfPlayers;
}


public void setNoOfPlayers(int noOfPlayers) {
	this.noOfPlayers = noOfPlayers;
}


public Player[] getGame() {
	return players;
}

public void setGame(Player[] game) {
	this.players = game;
}


@Override
public String toString() {
	return "Game [players=" + Arrays.toString(players) + "]";
}

public void startGame(int noOfPlayas) {
	//Game(noOfPlayas);
	for (int i=1; i<=noOfPlayas; i++) {
		String names = JOptionPane.showInputDialog(null, "Enter player " + noOfPlayas + " name:" );
	}
}
}

//while (!finished) {
//	// Player takes a turn
//	Player currentP = players.getIndex(PlayerID);
//	//++..
//	
//	//Update the board
//	finished = board.movePlayer(currentP, roll);
//	
//	//Print out movement
//	System.out.println(board\r);
//	
//	if (finished) {
//		System.out.println(currentP + " has dogeded the snakes and climbed to the top!");
//		System.out.println("The rest of you loses, Game Over.");
//	}
//	
//	//Next player to Roll
//	PlayerID++;
//	if (PlayerID == noOfPlayers) {
//		PlayerID = 0;
//	
//}
//
//}}
