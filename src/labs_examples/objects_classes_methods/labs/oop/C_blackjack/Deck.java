package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

/**
 * This class holds data about the Deck of Cards
 */
public class Deck {
    public Card[] cards = new Card[52];
    public ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Deck() {
        // initialize with an empty deck
    }

    public Card[] getCards() {
        return cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    /**
     * Builds a new deck of 52 cards, made up of 4 suits, 4 face-cards and value cards of 2-10
     */
    public void populateDeck() {
        char[] suit = {'♠', '♦', '♥', '♣'};
        char[] faceCard = {'J', 'K', 'Q', 'A'};
        int cardIndex = 0;

        // suit char index
        for (int j =0; j<4; j++) {
            // populate deck for cards 2-10 for ea suit
            for (int i = 2; i < 11; i++) {
                cards[cardIndex] = new Card(suit[j], i);
                cardIndex++;
            }
            for (int l = 0; l < 4; l++) { // loop thru faceCard for each suit
                cards[cardIndex] = new Card(suit[j], faceCard[l]);
                cardIndex++;
            }
        }
    }
}