import java.util.ArrayList;

public class BlackJack {

  private ArrayList<Deck> players = new ArrayList<>();

  public static void main(String[] args) {
    boolean game = true;
    setUpGame();
    while (game) {
      playGame();
      endGame();
      playAgain();
    }

    public void playGame() {

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
