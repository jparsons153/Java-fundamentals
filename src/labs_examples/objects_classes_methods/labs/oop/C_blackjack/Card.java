package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card { // holds card data
    public char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    public int cardValue;
    public char[] faceCard = new char[]{'J', 'K', 'Q', 'A'};

    public Card(char[] suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Card(char[] suit, char[] faceCard) {
        this.suit = suit;
        this.faceCard = faceCard;
    }
}
