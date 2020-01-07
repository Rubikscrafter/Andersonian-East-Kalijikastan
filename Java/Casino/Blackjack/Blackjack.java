package Blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
  // Instance variables
  private Deck playingDeck = new Deck("Playing deck");
  private ArrayList<Deck> hands = new ArrayList<>();  // Holds dealer and player hands
  private Scanner keys = new Scanner(System.in);

  // Game constructor
  private Blackjack() {
    setUpGame();
    playGame();
    playAgain();
  }

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
  /*
  How to play

  Blackjack - when you are dealt a 10 and an ace on the initial deal
  Hit - Committing to being dealt another card from the dealer
  Stand - Committing to not recieving any more cards from the dealers
  */
  private void playGame() {
    clearScreen();
    System.out.println("Dealer deals hands.");
    initialDeal();
    checkForBlackjack();
    playRounds();
  }

  private void playRounds() {
    // TODO - Make dealer hit or stand based on probabilities
    
  }

  // Finishes the game
  private void endGame(int winner) {
    if (winner == 0)
    System.out.println("The dealer won with the following hand: ");
    else
    System.out.println("Player " + winner + " won with the following hand:");
    hands.get(winner).showDeck();

    for (Deck player : hands)
    if (player != hands.get(winner))
    player.showDeck();
  }

  // Asks if you want to play again
  private void playAgain() {
    System.out.println();
    System.out.println("Do you want to play again? (Y for yes, N for no)");
    String answer = keys.nextLine();
    if (answer.equalsIgnoreCase("Y"))
      new Blackjack();
    System.out.println("Thanks for playing!");
  }

  //-----------------------------------Small Game Functions-----------------------------------//

  private void initialDeal() {
    for (Deck player : hands) {
      player.add(playingDeck.removeFromTop());
      player.add(playingDeck.removeFromTop());
    }
  }

  private boolean checkForBlackjack() {
    for (int i = 0; i < hands.size(); i++)
    if (hands.get(i).getDeckValue() == 21)
    endGame(i);
  }

  //-------------------------------------Small Functions--------------------------------------//

  private void clearScreen() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  // Main
  public static void main(String[] args) {
    new Blackjack();
  }
}
