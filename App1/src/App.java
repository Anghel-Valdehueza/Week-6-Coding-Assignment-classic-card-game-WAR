
//@author angeluz
/*
 * ********************
 * Step 2
 * ********************
 */

public class App {

	public static void main(String[] args) {
        /*
        * ********************
        * Step 2.a
        * ********************
        */
       Deck deck = new Deck();
       Player player1 = new Player("1");
       Player player2 = new Player("2");
       deck.shuffle();

       /*
        * ********************
        * Step 2.b
        * ********************
        */
       for (int i = 0; i < 52; i++) {
           if ( i % 2 == 0) {
               player1.draw(deck);
           }
           
           else {
               player2.draw(deck);
           }
       }

       /*
        * ********************
        * Step 2.c
        * ********************
        */
       for (int i = 0; i < 26; i++) {
           Card player1Card = player1.flip();
           System.out.print("Player1 ");
           /*
            * ********************
            * Step 3.a
            * ********************
            */
           player1Card.describe();
           System.out.print("Player2 ");
           Card player2Card = player2.flip();
           player2Card.describe();
           System.out.println();
           if (player1Card.getValue() > player2Card.getValue()) {
                /*
                 * ********************
                 * Step 2.d
                 * ********************
                 */
               player1.incrementScore();
               /*
                * ********************
                * Step 3.b
                * ********************
                */
               System.out.println("Player1 is the winner of this turn!");
               
           } 
           else if (player1Card.getValue() < player2Card.getValue()) {
               player2.incrementScore();
               System.out.println("Player2 is the winner of this turn!");
             
           }
           else{
               System.out.println("It is a DRAW!");
           }
           /*
            * ********************
            * Step 3.c
            * ********************
            */
           System.out.println();
           System.out.printf("Player1 score = %d\n", player1.getScore());
           System.out.printf("Player2 score = %d\n", player2.getScore());
           System.out.println();
       }
       /*
        * ********************
        * Step 3.d
        * ********************
        */
       System.out.printf("Player1's final score = %d\n", player1.getScore());
       System.out.printf("Player2's final score = %d\n", player2.getScore());
       System.out.println();
       /*
        * ********************
        * Step 2.e
        * ********************
        */
       if (player1.getScore() > player2.getScore()) {
           /*
            * ********************
            * Step 2.f
            * ********************
            */
           System.out.println("Player1 is the winner in the game!");
       } 
       else if (player1.getScore() < player2.getScore()) {
           System.out.println("Player2 is the winner in the game!");
       } 
       else {
           System.out.println("The game is DRAW!");
       }
   }
}
