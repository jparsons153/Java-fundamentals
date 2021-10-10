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

        Deck fullDeck = new Deck(); // populate a new deck
        fullDeck.populateDeck();

        Player computer = new Player("computer", 0, 0); // create computer player
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player username: ");
        String input = scanner.nextLine();
        Player player = new Player(input, 100, 0); // create player object with name input from console

        System.out.println("Initial pot value $" + player.getPotValue());

        Scanner takeBet = new Scanner(System.in);
        System.out.print("Enter bet $"); // take a bet from the player
        player.setBet(takeBet.nextInt());
        System.out.println("\n");

        for (int i = 1; i < 3; i++) { // deal player & computer two cards each
            deal(player, fullDeck);
            deal(computer, fullDeck);
        }

        do {
            handScore(player); //calculate handScore
            handCards(player); //print hand and print if > 21
            Boolean bool = greaterthan21(player.hand);
            System.out.println("Is players hand greater than or equal to 21 " + bool);
            if (bool) {
                break;
            }

            Scanner newCard = new Scanner(System.in);
            System.out.print("Request another card Y/N: ");
            requestCard = scanner.next().charAt(0);
            if (requestCard == 'Y') { // if request another card, deal one more
                deal(player, fullDeck);
            }
            else {
                break;
            }

            handScore(computer);

            AIbool = computer.computerAI(computer.hand.handValue); //if computer hand < 16, request another card
            if (AIbool) {
                System.out.println("Computer has taken another card");
                deal(computer, fullDeck);
            } else if (computer.hand.handValue >= 21) {
                break;
            }

        } while ((player.hand.handValue < 22 | computer.hand.handValue < 22)); //continue play if requested another card & handvalue < 21
        //} while (player.getBet() < player.potValue);

        handScore(player); //calculate handScore, print hand and print if > 21
        handScore(computer);

        if (player.hand.handValue > computer.hand.handValue && player.hand.handValue < 21) {
            player.potValue = 2 * player.getBet();
            System.out.println("\n" +"Player has won!!");
            System.out.println("Your potValue = $" + player.getPotValue());
        }
        else if (player.hand.handValue == 21) {
            player.potValue = 2.5 * player.getBet();
            System.out.println("\n" +"Player has hit BlackJack, congratulations!!");
            System.out.println("Your potValue = $" + player.getPotValue());
        }
        else if (computer.hand.handValue > player.hand.handValue && computer.hand.handValue <= 21) {
            player.potValue = 0;
            System.out.println("\n" +"Computer has won, try again!!" +"\n");
        }
        else if ((player.hand.handValue == computer.hand.handValue && player.hand.handValue < 21)) {
            player.potValue = player.getBet();
            System.out.println("\n" +"Draw"+ "\n");
        }
        else {
            player.potValue = 0;
            System.out.println("\n" +"Try again"+ "\n");
        }
    }

    public static void deal(Player player, Deck fullDeck) {
        int min = 1;
        int max = 52;
        int random_int;

        do {
            random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Card number " + random_int + " drawn");

            Card[] cards = fullDeck.getCards();
            Card myCard = cards[random_int];

            Hand myhand = player.hand;
            ArrayList<Card> myCards = myhand.cards;

            myCards.add(myCard); // add card object from array at random number to playerCards Arraylist

            fullDeck.getUsedCards().add(random_int);   // add card number to usedCard arraylist

        } while (!fullDeck.getUsedCards().contains(random_int));
    }

    public static int handScore(Player player) {

        for (Card card : player.hand.cards) { //for each card do the following

            if (card.getCardValue() > 1 && card.getCardValue() < 11) { // if cardNumber add int to handValue
                player.hand.handValue += card.getCardValue();
            } else if (card.getFaceCard() == 'A') { // if faceCard = A add 1 to handValue
                player.hand.handValue += 1;
            } else { // else faceCard is K, Q or J add 10 to handValue
                player.hand.handValue += 10;
            }
        }
        valueOfAce(player);

        return player.hand.handValue;
    }

    public static int valueOfAce(Player player) {
        boolean Ace = false;
        boolean faceCard = false;

        for (Card card : player.hand.cards) { //for each card do the following

            if (card.getFaceCard() == 'A') {
                Ace = true;
            }
            else if (card.getFaceCard() == 'K' | card.getFaceCard() == 'Q' | card.getFaceCard() == 'J') {
                faceCard = true;
            }
        }
        if (Ace && faceCard) {
            player.hand.handValue += 10;
        }
        return player.hand.handValue;
    }

    public static void handCards(Player player){
        System.out.println("\n" +player.getName()+ " has a hand of ");
        for (Card n : player.hand.get_Cards()) { // print each Card object in playerCards
            System.out.println(n);
        }
        System.out.println("\n" + player.getName() +" hand value = " + player.hand.handValue); // print handValue & if >21
    }

    public static boolean greaterthan21(Hand hand) {
        return hand.handValue >= 21; // return true if >=21 otherwise return false
    }
}
