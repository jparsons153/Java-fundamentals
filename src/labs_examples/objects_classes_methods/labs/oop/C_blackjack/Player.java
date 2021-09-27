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

    //int handValue = getHandValue();

    public static boolean computerAI(int handValue){ // return true or false if computer wants another card
      if(handValue<=16){ // if < 16 computer wants another card, else return false
          return true;
      }
      else return false;
    }

}
