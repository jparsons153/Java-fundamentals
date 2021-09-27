package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackController {

    public static void deal(Player player, ArrayList<Integer> usedCards,ArrayList<Card> cards){ //pass in Player object, change Player to player object?
        int min = 1;
        int max = 52;

        for (int i = 1; i < 53; i++) { // assumed each card can only be drawn once
            System.out.println("Random value in int from " + min + "to" + max + ":"); //generate random card number
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println(random_int);

            if (usedCards.contains(random_int)) { //check if card has already been drawn if so request another card
                continue;
            }

            cards.add(cards[random_int]); // add card object drawn to card Arraylist in Hand class
            usedCards.add(random_int);   // add card number to usedcard arraylist
        }
    }

    public static void playBlackJack(){
        Player computer = new Player(); // create players

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player username: ");
        String player = scanner.next();
        Player player = new Player(); // New Player needs to be a new string, how to set equal to scanner input?
    }

    public static void main (String[]args){

        Deck.populateDeck(); // populate deck of cards in Deck class

        //deal();

        }
    }

