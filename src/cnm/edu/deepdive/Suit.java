package cnm.edu.deepdive;

public enum Suit {
  HEARTS, DIAMONDS, CLUBS, SPADES;

  private static final String[] SYMBOLS = {"\u2665", "\u2666", "\u2663", "\u2660"};

  @Override
  public String toString() {
    return SYMBOLS[ordinal()];

  }
}
