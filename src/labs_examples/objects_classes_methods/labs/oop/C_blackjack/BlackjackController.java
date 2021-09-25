package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class BlackjackController {

    public static void deal(Player, ArrayList<Integer> usedCards) { //pass in Player object, change Player to player object?
        int min = 1;
        int max = 52;

        for (int i = 1; i < 53; i++) { // assumed each card can only be drawn once
            System.out.println("Random value in int from " + min + "to" + max + ":"); //generate random card number
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println(random_int);

            if (usedCards.contains(random_int)) { //check if card has already been drawn
                continue;
            }
            cardNumber = random_int; // how to bring in cardNumber index from Deck class?
            cards.add(card[cardNumber]); // add card to card Arraylist in Hand class
            usedCards.add(cardNumber);   // add card number to usedcard arraylist
        }
    }

        public static void main (String[]args){

            populateDeck();

            deal();

        }
    }

