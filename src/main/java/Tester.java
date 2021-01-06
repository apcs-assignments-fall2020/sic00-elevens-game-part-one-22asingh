/**
 * This is a class that tests the Card and Deck classees.
 */
public class Tester {

	public static void main(String[] args) {
        //Card card = new Card("2", "Hearts", 2);
        //System.out.println(card);
        //System.out.println(card.getRank());
        //System.out.println(card.getSuit());
        //System.out.println(card.getPointValue());
        
        String[] ranks = {"Ace", "2", "3"};
        String[] suits = {"Clubs", "Hearts"};
        int[] values = {1, 2, 3};
        Deck d1 = new Deck(ranks, suits, values);
        System.out.println(d1);
	}
}
