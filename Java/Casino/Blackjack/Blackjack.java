import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {

  private ArrayList<Deck> players = new ArrayList<>();
  private Scanner keys = new Scanner(System.in);

  public static void main(String[] args) {
    boolean game = true;
    setUpGame();
    while (game) {
      playGame();
      endGame();
      playAgain();
    }

    public void playGame() {
      System.out.println("Welcome to Blackjack!\n");
      System.out.println("How many people are playing?: ");
      while (true) {
        try {
          int players = keys.nextInt();
        } catch (Exception e) {
          System.out.println("Please enter a valid integer number of players.\n");
        } else {
          break;
        }
      }
      
    }

    public void endGame() {

    }

    public void playAgain() {
      System.out.println("Do you want to play again?");
    }

    public clearScreen() {
      System.out.flush();
    }
  }
}
