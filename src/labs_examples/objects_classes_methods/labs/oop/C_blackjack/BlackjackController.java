package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main (String[]args){

        playBlackJack();

    }

        public static void playBlackJack(){

        char requestCard;
        Boolean AIbool;

        Deck fullDeck = new Deck();
            fullDeck.populateDeck();

        Player computer = new Player("computer",0); // create computer player
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player username: ");
        String input = scanner.nextLine();
        Player player = new Player(input,0); // create player object with name input from console

            do {
                deal(player, fullDeck);
                    for (Card n : player.hand.get_Cards()) { // print each Card object in playerCards
                        System.out.println(n);
                    }
                Hand.handScore(player.hand.get_Cards(), 0); // call handScore method to calculate value of hand
                System.out.println("Players hand value = " + player.hand.handValue); // print handValue & if >21
                Boolean bool = Hand.greaterthan21(player.hand.handValue);
                System.out.println("Is players hand greater than 21 " + bool);

                Scanner newCard = new Scanner(System.in);
                System.out.print("Request another card Y/N: ");
                requestCard = scanner.next().charAt(0);

                deal(computer, fullDeck);
                Hand.handScore(computer.hand.get_Cards(), 0);

                AIbool = computer.computerAI(computer.hand.handValue);
                    if(AIbool) {
                        System.out.println("Computer has taken another card");
                    }

            } while((requestCard == 'Y' & AIbool) | (player.hand.handValue < 21 | computer.hand.handValue < 21)); //continue play if requested another card & handvalue < 21

            // create method for printing hand + handValue??

            System.out.println("User " +player.getName()+ "has a hand of: " );
                for (Card n : player.hand.get_Cards()) { // print each Card object in playerCards
                    System.out.println(n);
                }
            System.out.println("with a hand score of " +player.hand.handValue);

            System.out.println("Computer " +computer.getName()+ "has a hand of: " );
            for (Card n : computer.hand.get_Cards()) { // print each Card object in playerCards
                System.out.println(n);
            }
            System.out.println("with a hand score of " +computer.hand.handValue);
    }

    public static void deal(Player player, Deck fullDeck){
        int min = 1;
        int max = 52;

        for (int i = 1; i < 3; i++) { // deal player two cards
            System.out.println("Random value in int from " + min + " to " + max + ":"); //generate random card number
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Card number " +random_int+ " drawn");
            System.out.println("which is " + fullDeck.getCards()[random_int]); // find card from Card array in deck class
                                                                                // use toString method

                if (fullDeck.getUsedCards().contains(random_int)) { //check if card has already been drawn if so request another card
                    continue;
                }

            player.hand.cards.add(fullDeck.getCards()[random_int]); // add card object from array at random number to playerCards Arraylist
                                                                    // NullPointerException??

            fullDeck.getUsedCards().add(random_int);   // add card number to usedCard arraylist
        }
    }
    }

