package challengeCardSharp;

public class PlayingCard {

	private static final int MIN_VALUE = 2;
	private static final int MAX_VALUE = 14;

	// Instance Variables

	private Suit suit;
	private int value; // Constructor

	/**
	 * @param suit
	 * @param value
	 */
	public PlayingCard(Suit suit, int value) throws IllegalArgumentException {
		this.setSuit(suit);
		this.setValue(value);
	}

	// Getters and setters

	/**
	 * @return the suit
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(Suit suit) throws IllegalArgumentException {
		if (suit == null) {
			throw new IllegalArgumentException("SUIT IS NULL");
		}
		this.suit = suit;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		if (value >= MIN_VALUE && value <= MAX_VALUE) {
			this.value = value;
		} else {
			throw new IllegalArgumentException("VALUE IS INVALID");
		}
	}

	private String valueInWords(int value) {

		String numberValue = "VALUE NOT SET - ERROR";

		switch (value) {
		case 2:
			numberValue = "Two";
			break;
		case 3:
			numberValue = "Three";
			break;
		case 4:
			numberValue = "Four";
			break;
		case 5:
			numberValue = "Five";
			break;
		case 6:
			numberValue = "Six";
			break;
		case 7:
			numberValue = "Seven";
			break;
		case 8:
			numberValue = "Eight";
			break;
		case 9:
			numberValue = "Nine";
			break;
		case 10:
			numberValue = "Ten";
			break;
		case 11:
			numberValue = "Jack";
			break;
		case 12:
			numberValue = "Queen";
			break;
		case 13:
			numberValue = "King";
			break;
		case 14:
			numberValue = "Ace";
			break;
		}
		return numberValue;
	}

	public String suitInWords(Suit suit) {

		String suitValue = "SUIT NOT SET - ERROR";

		switch (suit) {
		case CLUBS:
			suitValue = "Clubs";
			break;
		case DIAMONDS:
			suitValue = "Diamonds";
			break;
		case HEARTS:
			suitValue = "Hearts";
			break;
		case SPADES:
			suitValue = "Spades";
			break;

		}
		return suitValue;
	}

	
	public String toString() {
		return String.format("%s of %s", valueInWords(this.value), suitInWords(this.suit));
	}
	
}
