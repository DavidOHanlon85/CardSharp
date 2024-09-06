/**
 * 
 */
package challengeCardSharp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class CardSharpDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<PlayingCard> myDeck = newDeck();
		// printDeck(myDeck);
		System.out.println(myDeck);

		shuffleDeck(myDeck);
		System.out.println(myDeck);

		sortDeck(myDeck);
		System.out.println(myDeck);

	}

	/**
	 * This method sorts the deck in ascending order in each suit - clubs, diamonds,
	 * hearts, spades
	 * 
	 * @param myDeck
	 */
	public static void sortDeck(List<PlayingCard> myDeck) {
		Collections.sort(myDeck, new SortByValue());
		Collections.sort(myDeck, new SortBySuit());
	}

	/**
	 * @param myDeck
	 */
	public static void shuffleDeck(List<PlayingCard> myDeck) {
		Collections.shuffle(myDeck);
	}

	/**
	 * This method prints the current deck
	 * 
	 * @param myDeck
	 */
	public static void printDeck(List<PlayingCard> myDeck) {
		for (PlayingCard s : myDeck) {
			System.out.println(s.toString());
		}
	}

	/**
	 * This method creates a new deck with all cards in order
	 * 
	 * @return
	 */
	public static List<PlayingCard> newDeck() {
		List<PlayingCard> myDeck = new ArrayList<PlayingCard>(52);

		Suit[] suits = Suit.values();

		for (Suit s : suits) {
			for (int i = 2; i <= 14; i++) {
				myDeck.add(new PlayingCard(s, i));
			}
		}
		return myDeck;
	}

}
