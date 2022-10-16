
// @author angeluz

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	 /*
     * ********************
     * Step 1.b.i.1
     * ********************
     */
    List<Card> cards = new ArrayList<Card>();
    List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
    
    /*
     * ********************
     * Step 1.b.ii.3
     * ********************
     */   
    public Deck() {

        for (int i = 2; i < 15; i++) {

            for (String suit : suits) {
                cards.add(new Card(i, suit));
            }
        }
    }

    /*
     * ********************
     * Step 1.b.ii.1
     * ********************
     */    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    /*
     * ********************
     * Step 1.b.ii.2
     * ********************
     */   
    public Card draw() {
        return cards.remove(0);
    }
    
}
