package Casino.Blackjack;

public class Card {

  private String id;  // Holds suit and number/face
  private int val;  // Holds value of card

  Card(String id, int val) {
    this.id = id;
    this.val = val;
  }

  // To change aces to have a value of one instead of eleven
  public void changeToOne() {
    val = 1;
  }

  String showCard() {return id;}
  int getVal() {return val;}
}
