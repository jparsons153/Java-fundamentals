package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public static int handScore(ArrayList<Card> cards, int handValue) {
        for (Card n : cards) { //for each card do the following

            if (cards[n].getfaceCard = 'A') { // if faceCard = A add 1 to handValue
                handValue = +1;
            } else if (cards[n].getcardNumber < 11) { // if cardNumber add int to handValue
                handValue = +cards[n].getcardNumber;
            } else { // else faceCard is K, Q or J add 10 to handValue
                handValue = +10;
            }
        }
        return handValue;
    }

    public static boolean greaterthan21(int handValue) {
        if (handValue ==21) {
            return true;
        }
        else return false;
    }
}


