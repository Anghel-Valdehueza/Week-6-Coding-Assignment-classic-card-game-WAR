
//@author angeluz


public class Card {

	/*
     * ********************
     * Step 1.a.i.1.
     * ********************
     */
    private int value;
    /*
     * ********************
     * Step 1.a.i.2.
     * ********************
     */
    private String name;
    
    
    public Card(int newValue, String suit) {

        value = newValue;

        switch(newValue) {
            case 2: name = "Two";
                break;
            case 3: name = "Three";
                break;
            case 4: name = "Four";
                break;
            case 5: name = "Five";
                break;
            case 6: name = "Six";
                break;
            case 7: name = "Seven";
                break;
            case 8: name = "Eight";
                break;
            case 9: name = "Nine";
                break;
            case 10: name = "Ten";
                break;
            case 11: name = "Jack";
                break;
            case 12: name = "Queen";
                break;
            case 13: name = "King";
                break;
            case 14: name = "Ace";
                break;
        }

        name += " of " + suit;

    }
    /*
     * ********************
     * Step 1.a.ii.2
     * ********************
     */
    public void describe() {
        System.out.printf("Card: %s with value of %d\n", name, value);
    }
    
    /*
     * ********************
     * Step 1.a.ii.1
     * ********************
     */
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
