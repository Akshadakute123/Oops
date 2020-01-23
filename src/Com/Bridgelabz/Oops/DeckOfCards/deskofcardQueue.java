package Com.Bridgelabz.Oops.DeckOfCards;

import java.util.Scanner;


public class deskofcardQueue {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter numbers of players");
		DeskofCardQueueOperation.players = sc.nextInt(); // numbers of players
		System.out.println("Amount of cards to distribute " + DeskofCardQueueOperation.players + " players");
		DeskofCardQueueOperation.playcards = sc.nextInt(); // numbers of each players cards
		DeskofCardQueueOperation.playerscards();

	}
}