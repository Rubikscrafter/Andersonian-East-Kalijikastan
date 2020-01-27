
import java.util.ArrayList;
import java.util.List;

public abstract class Board {

  /**
  * The cards shown on the board.
  */
  private Arraylist<Card> cards;

  /**
  * The playing deck.
  */
  private Deck playingDeck;

  /**
  * Creates a new board instance.
  * @param playingDeck the deck to be used for playing.
  */
  public Board (Deck playingDeck) {
    this.playingDeck = playingDeck;
  }

  /**
  * Start a new game by shuffling the deck and
  * dealing some cards to this board.
  */
  public void newGame() {
    deck.shuffle();
  }
}
