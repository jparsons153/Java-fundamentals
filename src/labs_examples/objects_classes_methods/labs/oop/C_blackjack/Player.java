package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player { // player info
    String name;
    Hand hand = new Hand();
    double potValue; //(the amount of money they have)
    double bet;
    static int gamesWon;

    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
        this.bet = 0;
        this.gamesWon =0;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public double getPotValue() {
        return potValue;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public static boolean computerAI(int handValue){ // return true or false if computer wants another card
      if(handValue<=16){ // if < 16 computer wants another card, else return false
          return true;
      }
      else return false;
    }

}
