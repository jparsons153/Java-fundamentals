package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player { // player info
    String name;
    Hand hand;
    int potValue; //(the amount of money they have)

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }
}
