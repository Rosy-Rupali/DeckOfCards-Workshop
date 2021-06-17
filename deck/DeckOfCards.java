/**************************************************
 * Purpose : Deck Of Cards program
 * @author Rosy Rupali
 * @since 17-06-2021
 *
 *************************************************/
package deck;

import java.util.ArrayList;

public class DeckOfCards {

	ArrayList<Card> cards = new ArrayList<Card>(52);

	private static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };

	private static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	/**
	 *Initializing the game setup of deck of cards 
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
	 * @return the cards with the suit and the rank
	 */
	private ArrayList<Card> getDeck() {
		return cards;
	}

	public static void main(String[] args) {
		DeckOfCards deckOfCard = new DeckOfCards();
		deckOfCard.setupDeck();
		
		// printing the deck
		System.out.println(deckOfCard.getDeck());

	}

}
