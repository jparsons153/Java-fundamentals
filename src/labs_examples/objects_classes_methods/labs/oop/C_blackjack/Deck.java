package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck { //holds deck data
    Card[] cards;
    ArrayList<Integer> usedCards;
    char[] suit = {'♠', '♦', '♥', '♣'};
    char[] faceCard = {'J', 'K', 'Q', 'A'};

    public void populateDeck(){
        Card card[] = new Card[52];
        int cardNumber=0;
            for (int j =0; j<5; j++){ // suit char index
                for (int i = 2; i < 11; i++) { // populate deck for cards 2-10 for ea suit
                card[cardNumber] = new Card(suit[j],i);
                    cardNumber =+1;
            }
                for (int l =0; l<5; l++) { // loop thru faceCard for each suit
                    card[cardNumber] = new Card(suit[j],faceCard[l]);
                    cardNumber =+1;
                }
        }
        }

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }
}