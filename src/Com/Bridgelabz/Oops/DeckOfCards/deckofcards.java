package Com.Bridgelabz.Oops.DeckOfCards;

import java.util.Scanner;


public class deckofcards {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter numbers of players");
		operations.players = sc.nextInt(); // numbers of players
		System.out.println("Amount of cards to distribute " + operations.players + " players");
		operations.playcards = sc.nextInt(); // numbers of cards for each player

		operations.playerscards();
		operations.showPlayersCard();

	}

}