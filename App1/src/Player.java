
//@author angeluz

import java.util.ArrayList;
import java.util.List;


public class Player {

	  /*
     * ********************
     * Step 1.c..i.1
     * ********************
     */
    private List<Card> hand = new ArrayList<Card>();
    /*
     * ********************
     * Step 1.c..i.2
     * ********************
     */
    private int score;
     /*
     * ********************
     * Step 1.c..i.3
     * ********************
     */
    private String name;

    public Player() {
        score = 0;
    }

    public Player(String newName) {
        name = newName;
        score = 0;
    }
    
     /*
     * ********************
     * Step 1.c..ii.1
     * ********************
     */
    public void describe() {
        System.out.printf("Player %s has the following cards: \n", name);
        for (Card card : hand) {
            card.describe();
        }
    }
     /*
     * ********************
     * Step 1.c..i.2
     * ********************
     */
    public Card flip() {
        return hand.remove(0);
    }
    
     /*
     * ********************
     * Step 1.c..i.3
     * ********************
     */
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
    
     /*
     * ********************
     * Step 1.c..i.4
     * ********************
     */
    public void incrementScore() {
        score++;
    }
    public int getScore() {
        return score;
    } 
}
