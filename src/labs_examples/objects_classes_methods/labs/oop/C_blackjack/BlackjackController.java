package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackController {

        public static void playBlackJack(){

        Deck fullDeck = new Deck(); // call populateDeck method for new object??

        Player computer = new Player("computer",0); // create computer player
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player username: ");
        String input = scanner.nextLine();
        Player player = new Player(input,0); // create player object with name input from console

        deal(player,fullDeck);
            for(Card n : player.hand.getCards()){System.out.println(n);} // print each Card object in playerCards
            Hand.handScore(player.hand.getCards(),0); // call handScore method to calculate value of hand
            System.out.println("Players hand value = " +player.hand.handValue); // print handValue & if >21
            Boolean bool = Hand.greaterthan21(player.hand.handValue);
            System.out.println("Is players hand greater than 21 " +bool);

        deal(computer,fullDeck);
            Hand.handScore(computer.hand.getCards(),0);
    }

    public static void deal(Player player, Deck fullDeck){
        int min = 1;
        int max = 52;

        for (int i = 1; i < 3; i++) { // deal player two cards
            System.out.println("Random value in int from " + min + "to" + max + ":"); //generate random card number
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Card number " +random_int+ " drawn");
            System.out.println("which is " + fullDeck.getCards()[random_int]); // find card from Card array in deck class

            if (fullDeck.getUsedCards().contains(random_int)) { //check if card has already been drawn if so request another card
                continue;
            }

            player.hand.getCards().add(fullDeck.getCards()[random_int]); // add card object from array at random number to playerCards Arraylist

            fullDeck.getUsedCards().add(random_int);   // add card number to usedcard arraylist
        }
    }


    public static void main (String[]args){

        Deck.populateDeck(); // populate deck of cards in Deck class
                            // call method for new Deck object??

        playBlackJack();

        }
    }

