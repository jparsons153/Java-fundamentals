package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card { // holds card data
    public char suit;

    public int cardValue;
    public char faceCard;

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Card(char suit, char faceCard) {
        this.suit = suit;
        this.faceCard = faceCard;
    }

    public int getCardValue() {
        return cardValue;
    }

    public char getFaceCard() {
        return faceCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", cardValue=" + cardValue +
                ", faceCard=" + faceCard +
                '}';
    }
}
