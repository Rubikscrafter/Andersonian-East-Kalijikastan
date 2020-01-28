package Casino.Blackjack.In_JPanel;

import java.util.List;
import java.util.ArrayList;

/*
IDEA - Make the display swap for every person to go. Always show dealer hand on top.
Rules
Everyone, including dealer, is dealt 2 cards. One of the dealer's cards is face up, the other is face down.
PLayers take turns either hitting or standing until all players have either busted or stood.
Dealer reveals turned down card. Proceeds to deal until reaches 17 or higher.

Win Conditions
Player does not bust, dealer does
Player's total is greater than dealer's total
* One a time, the player neither gains nor loses any money.

Extra Rules
TODO - Double down
TODO - Betting in general
TODO - Saving progress? json stuff maybe with code to access


*/

public class BlackjackBoard {

  /**
  * The cards shown on the board. Swaps with each player.
  */
  private List<Card> cards;

  /**
  * Hands of all players, including dealer. Dealer is deck in index 0.
  */
  private List<Deck> hands;

  /**
  * The deck used to deal cards to the dealer and to the players.
  */
  private Deck playingDeck;

  /**
  * Creates a new board instance.
  * @param playingDeck the deck to be used for playing.
  */
  BlackjackBoard(Deck playingDeck) {
    this.playingDeck = playingDeck;
  }

}
