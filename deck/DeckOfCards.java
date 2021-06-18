/**************************************************
 * Purpose : Deck Of Cards program
 * @author Rosy Rupali
 * @since 17-06-2021
 *
 *************************************************/
package deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {

	ArrayList<Card> cards = new ArrayList<Card>(52);
	private static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static List<Player> playerList = new ArrayList<Player>();
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Initializing the game setup of deck of cards
	 */
	private void setupDeck() {
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				this.cards.add(new Card(suit[i], rank[j]));
			}
		}
	}

	/**
	 * This method is use to display the deck
	 * 
	 * @return the cards with the suit and the rank
	 */
	private ArrayList<Card> getDeck() {
		return cards;
	}

	/**
	 * This method is use to add the players to play the card game
	 * 
	 * @param totalPlayers : number of player required to play the game
	 */
	private void addPlayers(int totalPlayers) {
		if (totalPlayers > 4) {
			System.out.println("Total number of player should be more than one and less than or equal to four ");
		} else {
			for (int i = 1; i <= totalPlayers; i++) {

				System.out.println("Enter the player's name ");
				String name = scanner.nextLine();
				Player player = new Player();
				player.setPlayerName(name);
				playerList.add(player);
				for (int k = 0; k < playerList.size(); k++) {
					System.out.println(playerList.get(k));
				}

			}

		}
	}
	
	private void playerSequence(int totalPlayer) {
		System.out.println("Enter the sequence of the players ");
		for(int i=0; i<totalPlayer; i++) {
			int order = scanner.nextInt(); 
			playerList.get(i).setTurn(order);
		}
	}

	public static void main(String[] args) {
		DeckOfCards deckOfCard = new DeckOfCards();
		deckOfCard.setupDeck();

		// printing the deck
		System.out.println(deckOfCard.getDeck());
		System.out.println("Enter the number of players ");
		int totalPlayers = scanner.nextInt();
		deckOfCard.addPlayers(totalPlayers);

	}

}
