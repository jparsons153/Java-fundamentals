package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        playBlackJack();
    }

    // potential extra features (excerise_04);
    // - Ace can be one (1) or eleven (11)
    // - call "blackjack" when dealt Ace + 10-value cards on the first two cards
    // - blackjack pays 3 to 2, $3 for very $2
    // - Hit vs stand

    public static void playBlackJack() {

        char requestCard;
        Boolean AIbool;

        Deck fullDeck = new Deck();
        fullDeck.populateDeck();

        Player computer = new Player("computer", 0, 0); // create computer player
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player username: ");
        String input = scanner.nextLine();
        Player player = new Player(input, 100, 0); // create player object with name input from console

        System.out.println("Initial pot value " + player.getPotValue());

        do {

            Scanner takeBet = new Scanner(System.in);
            System.out.print("Enter bet ");
            player.setBet(takeBet.nextInt());

            deal(player, fullDeck);
                System.out.println("\n" + "Player has a hand of ");
                for (Card n : player.hand.get_Cards()) { // print each Card object in playerCards
                    System.out.println(n);
                }
            Hand.handScore(player.hand.get_Cards(), player.hand.handValue); // call handScore method to calculate value of hand
            System.out.println("\n" + "Players hand value = " + player.hand.handValue); // print handValue & if >21
            Boolean bool = Hand.greaterthan21(player.hand.handValue);
            System.out.println("Is players hand greater than 21 " + bool);

            // where bool used? only continue if < 21

            Scanner newCard = new Scanner(System.in);
            System.out.print("Request another card Y/N: ");
            requestCard = scanner.next().charAt(0);

            deal(computer, fullDeck);
            Hand.handScore(computer.hand.get_Cards(), 0);

            AIbool = computer.computerAI(computer.hand.handValue);
                if (AIbool) {
                    System.out.println("Computer has taken another card");
                }

        } while ((requestCard == 'Y' & AIbool) | (player.hand.handValue < 21 | computer.hand.handValue < 21)); //continue play if requested another card & handvalue < 21

        // create method for printing hand + handValue??

        System.out.println("User " + player.getName() + "has a hand of: ");
            for (Card n : player.hand.get_Cards()) { // print each Card object in playerCards
                System.out.println(n);
            }
        System.out.println("with a hand score of " + player.hand.handValue);

        System.out.println("Computer " + computer.getName() + "has a hand of: ");
            for (Card n : computer.hand.get_Cards()) { // print each Card object in playerCards
                System.out.println(n);
            }
        System.out.println("with a hand score of " + computer.hand.handValue);

            if(player.hand.handValue > computer.hand.handValue && player.hand.handValue < 21){
                player.potValue = 2* player.getBet();
                System.out.println("\n Player has won!!");
                System.out.println("Your potValue = " + player.getPotValue());
            }
            else if(player.hand.handValue > computer.hand.handValue && player.hand.handValue == 21) {
                player.potValue = 2.5* player.getBet();
                System.out.println("\n Player has hit BlackJack, congratulations!!");
                System.out.println("Your potValue = " + player.getPotValue());
            }
            else if(computer.hand.handValue > player.hand.handValue && computer.hand.handValue <= 21) {
                player.potValue = 0;
                System.out.println("\n Computer has won, try again!! \n");
            }
            else if ((player.hand.handValue == computer.hand.handValue && player.hand.handValue < 21)) {
                player.potValue = player.getBet();
                System.out.println("\n Draw \n");
            }
            else{
                player.potValue = 0;
                System.out.println("\n Try again \n");
            }
        }

    public static void deal(Player player, Deck fullDeck) {
        int min = 1;
        int max = 52;

            for (int i = 1; i < 3; i++) { // deal player two cards

                int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println("\n" + "Card number " + random_int + " drawn");

                Card[] cards = fullDeck.getCards();
                Card myCard = cards[random_int];

                System.out.println("which is " + myCard); // find card from Card array in deck class

                if (fullDeck.getUsedCards().contains(random_int)) { //check if card has already been drawn if so request another card
                    continue;
                }


                Hand myhand = player.hand;
                ArrayList<Card> myCards = myhand.cards;

                myCards.add(myCard); // add card object from array at random number to playerCards Arraylist

                fullDeck.getUsedCards().add(random_int);   // add card number to usedCard arraylist
            }
        //} while (player.getBet() < player.potValue);

    }
}

