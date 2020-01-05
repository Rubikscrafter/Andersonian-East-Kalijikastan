public class Card {

  private String id;  // Holds suit and number/face
  private int val;  // Holds value of card
  private boolean one;  // True if the value of the card is one instead of eleven (used by aces only)

  // Constructor for all cards except aces
  public Card(String id, int val) {
    this.id = id;
    this.val = val;
  }

  // Constructor for aces
  public Card(String id, int val, boolean bool) {
    this.id = id;
    this.val = val;
    one = false;
  }

  public String showCard() {return id;}
  public int getVal() {return val;}
  public boolean changedToOne() {return one;}
}
