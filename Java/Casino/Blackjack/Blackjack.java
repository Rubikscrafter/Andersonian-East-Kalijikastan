package Blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
  // Instance variables
  private Deck playingDeck = new Deck("Playing deck");
  private ArrayList<Deck> hands = new ArrayList<>();  // Holds dealer and player hands
  private Scanner keys = new Scanner(System.in);
  private boolean game = true;

  // Game constructor
  private Blackjack() {
    setUpGame();
    playGame();
    playAgain();
  }

  //----------------------------------Main Functions-------------------------------------//

  // Sets up the game
  private void setUpGame() {
    hands.add(new Deck());
    System.out.println("Welcome to Blackjack!\n");
    System.out.println("How many people are playing?: ");
    int numOfPlayers = keys.nextInt();
    keys.nextLine();
    for (int i = 0; i < numOfPlayers; i++)
    hands.add(new Deck());
  }

  // Plays the game
  private void playGame() {
    clearScreen();
    initialDeal();
    checkForBlackjack();
    playRounds();
  }

  private void playRounds() {
    System.out.println("Dealer has dealt initial hands.");
    while (game) {
      for (int i = 0; i < hands.size(); i++) {
        takeTurn(i);
        if (!game)
        break;
      }
    }
  }

  //----------------------------------------Game Running Functions-----------------------------------//

  private void initialDeal() {
    for (Deck player : hands) {
      player.addToDeck(playingDeck.removeFromTop());
      player.addToDeck(playingDeck.removeFromTop());
    }
  }

  private void checkForBlackjack() {
    for (int i = 0; i < hands.size(); i++) {
      Deck player = hands.get(i);
      if (player.getDeckValue() == 21) {
        System.out.println("Dealer has dealt initial hands.");
        if (i == 0)
        System.out.println("Dealer got Blackjack!");
        else
        System.out.println("Player " + i + " got Blackjack!");
        endGameBlackjack(i);
      }
    }
  }

  private void takeTurn(int place) {
    Deck player = hands.get(place);
    if (place == 0) {
      if (player.getDeckValue() < 17)  // TODO - Make dealer hit or stand based on probabilities or ai but that might be od
      player.addToDeck(playingDeck.removeFromTop());
    } else {
      clearScreen();
      System.out.print("Player "+place+"'s Deck: ");
      player.showDeck();
      System.out.println("Would you like to hit or stand?\n\n\n");
      String answer = keys.nextLine();
      while (!answer.equalsIgnoreCase("hit") && !answer.equalsIgnoreCase("stand")) {
        System.out.println("Please enter either 'hit' or 'stand'.");
        answer = keys.nextLine();
      }
      if (answer.equalsIgnoreCase("hit"))
      hands.get(place).addToDeck(playingDeck.removeFromTop());
    }

    if (player.getDeckValue() > 21) {
      checkForBust(place);
    }
  }

  private void checkForBust(int player) {
    for (Card card : hands.get(player).getDeck())
    if (card.getVal() == 11)
    card.changeToOne();
    if (hands.get(player).getDeckValue() > 21) {
      clearScreen();
      if (player == 0)
      System.out.println("Dealer busted!");
      else
      System.out.println("Player " + player + " busted!");
      endGameBusted(player);
    }
  }

  //----------------------------------Game End Functions------------------------------------//

  // Ends te game if someone got blackjack
  private void endGameBlackjack(int winner) {
    game = false;
    if (winner == 0)
    System.out.print("The dealer won with the following hand: ");
    else
    System.out.print("Player " + winner + " won with the following hand:");
    hands.get(winner).showDeck();
    for (int i = 0; i < hands.size(); i++) {
      Deck player = hands.get(i);
      if (winner != 0 && i == 0) {
        System.out.print("Dealer's hand:");
        player.showDeck();
      } else if (player != hands.get(winner)) {
        System.out.print("Player " + i + "'s hand: ");
        player.showDeck();
      }
    }
  }

  // Ends the game if someone busted
  private void endGameBusted(int loser) {
    game = false;
    for (int i = 0; i < hands.size(); i++) {
      if (i == 0) {
        System.out.print("Dealer's hand: ");
        hands.get(i).showDeck();
      } else {
        System.out.print("Player "+i+"'s hand: ");
        hands.get(i).showDeck();
      }
    }
    compareDecks(loser);
  }

  private void compareDecks(int loser) {
    int highest = 0;
    int winner = 0;
    for (int i = 0; i < hands.size(); i++) {
      Deck player = hands.get(i);
      if (i != loser) {
        if (player.getDeckValue() > highest) {
          highest = player.getDeckValue();
          winner = i;
        }
      }
    }
    if (winner == 0)
    System.out.println("Dealer won!");
    else
    System.out.println("Player "+winner+" won!");
  }

  // Asks if you want to play again
  private void playAgain() {
    System.out.println("\n\nEnter anything to continue....");
    String pause = keys.next();
    clearScreen();
    System.out.println("Do you want to play again? (Y for yes, N for no)");
    String answer = keys.nextLine();
    if (answer.equalsIgnoreCase("Y"))
    new Blackjack();
    System.out.println("Thanks for playing!");
  }

  //-------------------------------------Small Functions--------------------------------------//

  private void clearScreen() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  //------------------------------------------Main--------------------------------------------//

  public static void main(String[] args) {
    new Blackjack();
  }
}
