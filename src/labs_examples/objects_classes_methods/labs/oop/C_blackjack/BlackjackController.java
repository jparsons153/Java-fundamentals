package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackController {

        public static void playBlackJack(Card[] cards, ArrayList<Integer> usedCards){
        ArrayList<Card> compCards; // create new arraylist for comp & player cards
        ArrayList<Card> playerCards;

        Hand compHand = new Hand(compCards,0); // create player & comp Hand objects
        Hand playerHand = new Hand(playerCards, 0);


        Player computer = new Player(computer,compHand,0); // create computer player
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player username: ");
        String input = scanner.nextLine();
        Player player = new Player(input,playerHand,0); // create player object with name input from console

        deal(player,usedCards,playerCards, cards);
            for(Card n : playerCards){System.out.println(n);} // print each Card object in playerCards
            Hand.handScore(playerCards,0); // call handScore method to calculate value of hand
            System.out.println("Players hand value = " +playerHand.handValue); // print handValue & if >21
            Boolean bool = Hand.greaterthan21(playerHand.handValue);
            System.out.println("Is players hand greater than 21 " +bool);

        deal(computer,usedCards,compCards, cards);
            Hand.handScore(compCards,0);
    }

    public static void deal(Player player, ArrayList<Integer> usedCards,ArrayList<Card> playerCards, Card[] cards){
        int min = 1;
        int max = 52;

        for (int i = 1; i < 3; i++) { // deal player two cards
            System.out.println("Random value in int from " + min + "to" + max + ":"); //generate random card number
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Card number " +random_int+ " drawn");
            System.out.println("which is " + cards[random_int]); // find card from Card array in deck class

            if (usedCards.contains(random_int)) { //check if card has already been drawn if so request another card
                continue;
            }

            playerCards.add(cards[random_int]); // add card object from array at random number to playerCards Arraylist

            usedCards.add(random_int);   // add card number to usedcard arraylist
        }
    }


    public static void main (String[]args){

        Deck.populateDeck(); // populate deck of cards in Deck class

        playBlackJack(Card[] cards, ArrayList<Integer> usedCards);

        }
    }

