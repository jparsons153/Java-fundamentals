package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck { //holds deck data
    Card[] cards;
    ArrayList<Integer> usedCards;

    public void populateDeck(){
        Card card[] = new Card[52];
        for (int k=1; k <53; k++){
            for (int j =0; j<5; j++){ // suit char index
                for (int i = 2; i < 11; i++) { // populate deck for cards 2-10 for ea suit
                card[k] = new Card(suit[j],i); //how to loop thru char array??
            }
                for (int l =0; l<5; l++) { // loop thru faceCard for each suit
                // insert method
                }
        }
        }
    }

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }
}
