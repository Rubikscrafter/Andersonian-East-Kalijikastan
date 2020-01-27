package Casino.Blackjack.In_JPanel;

public class BlackjackGUIRunner {
  public static void main(String[] args) {
    Board board = new ElevensBoard();
    CardGameGUI gui = new CardGameGUI(board);
    gui.displayGame();
  }
}
