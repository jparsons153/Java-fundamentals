package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck { //holds deck data
    public Card[] cards;
    public ArrayList<Integer> usedCards;


    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public static void populateDeck(){
        char[] suit = {'♠', '♦', '♥', '♣'};
        char[] faceCard = {'J', 'K', 'Q', 'A'};
        int cardIndex =0;

        Card card[] = new Card[52];
            for (int j =0; j<5; j++) { // suit char index
                for (int i = 2; i < 11; i++) { // populate deck for cards 2-10 for ea suit
                    card[cardIndex] = new Card(suit[j], i);
                    cardIndex = +1;
                }
                for (int l = 0; l < 5; l++) { // loop thru faceCard for each suit
                    card[cardIndex] = new Card(suit[j], faceCard[l]);
                    cardIndex = +1;
                }
            }
        }
}