package Casino.Blackjack.In_JPanel;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Deck {

  private List<Card> deck;
  private int deckValue;
  private boolean stand;

  // Player hand
  Deck() {
    deck = new ArrayList<>();
    deckValue = 0;
    stand = false;
  }

  // Playing deck
  Deck(String str) {
    deck = new ArrayList<>();
    deckValue = 0;
    String[] suits = {"♠","♥","♦","♣"};
    String[] cards = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    for (String card : cards) {
      for (String suit : suits) {
        if (card.equals("A"))
        addToDeck(new Card(card+suit, 11));
        else if (card.equals("J") || card.equals("Q") || card.equals("K"))
        addToDeck(new Card(card+suit, 10));
        else
        addToDeck(new Card(card+suit, Integer.parseInt(card)));
      }
    }
    Collections.shuffle(deck);
  }

  void addToDeck(Card card) {
    deck.add(card);
    deckValue += card.getVal();
  }

  Card removeFromTop() {return deck.remove(0);}

  int getDeckValue() {return deckValue;}
  List<Card> getDeck() {return deck;}
  boolean stood() {return stand;}

  void recount() {
    deckValue = 0;
    for (Card card : deck)
      deckValue += card.getVal();
  }
  void stand() {stand=true;}

  @Override
  public String toString() {
    for (Card card : deck)
      System.out.print(card+" ");
    return "";
  }
}
