package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck { //holds deck data
    public Card[] cards;
    public ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Deck() {
    }

    public Card[] getCards() {
        return cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void populateDeck(){
        char[] suit = {'♠', '♦', '♥', '♣'};
        char[] faceCard = {'J', 'K', 'Q', 'A'};


        Card cards[] = new Card[52];
        int cardIndex =0;
        for (int j =0; j<4; j++) { // suit char index
            for (int i = 2; i < 11; i++) { // populate deck for cards 2-10 for ea suit
                cards[cardIndex] = new Card(suit[j], i);
                cardIndex = cardIndex + 1;
            }
            for (int l = 0; l < 4; l++) { // loop thru faceCard for each suit
                cards[cardIndex] = new Card(suit[j], faceCard[l]);
                cardIndex += 1;
            }
        }
        this.cards = cards;
        }
}