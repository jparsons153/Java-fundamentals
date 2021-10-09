package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards; // access modifier? private / protected or public?
    int handValue = 0;

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public Hand() {
    }

    public ArrayList<Card> get_Cards() {
        return cards;
    }


    public static int handScore(ArrayList<Card> cards, int handValue) {
        for (Card card : cards) { //for each card do the following

            if (card.getFaceCard() == 'A') { // if faceCard = A add 1 to handValue
                handValue += 1;

            } else if (card.getCardValue() < 11) { // if cardNumber add int to handValue
                handValue += card.getCardValue();
            } else { // else faceCard is K, Q or J add 10 to handValue
                handValue += 10;
            }
        }
        return handValue;
    }

    public static boolean greaterthan21(int handValue) {
        return handValue >= 21; // return true if >21 otherwise return false
    }
}


