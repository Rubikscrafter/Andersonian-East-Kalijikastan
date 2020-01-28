package Casino.Blackjack.In_JPanel;

public class BlackjackGUIRunner {
  public static void main(String[] args) {
    BlackjackBoard board = new BlackjackBoard(new Deck(" "));
    CardGameGUI gui = new CardGameGUI(board);
    gui.displayGame();
  }
}
