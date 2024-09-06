/**
 * 
 */
package challengeCardSharp;

import java.util.Comparator;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class SortBySuit implements Comparator<PlayingCard> {

	@Override
	public int compare(PlayingCard o1, PlayingCard o2) {
		// TODO Auto-generated method stub
		return o1.getSuit().compareTo(o2.getSuit());
	}

}
