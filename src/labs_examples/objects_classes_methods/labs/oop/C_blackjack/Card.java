package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card { // holds card data
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

    public Card(char[] suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }
}
