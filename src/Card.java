public class Card {
    public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;

    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        String valusAsString = ""+ this.value;
        String suitAsString = "";
        if (this.value > 10) {
            if (this.value == 11) {
                valusAsString = "J";
            }
            if (this.value == 12) {
                valusAsString = "Q";
            }
            if (this.value == 13) {
                valusAsString = "K";
            }
            if (this.value == 14) {
                valusAsString = "A";
            }
        }
        if (this.suit == 0) {
            suitAsString = "Spades";
        }
        if (this.suit == 1) {
            suitAsString = "Diamonds";
        }
        if (this.suit == 2) {
            suitAsString = "Hearts";
        }
        if (this.suit == 3) {
            suitAsString = "Clubs";
        }
        return valusAsString + " of " + suitAsString;
    }
    public int getValue() {
        return value;
    }
    public int getSuit() {
        return suit;
    }

    public int compareTo(Card card) {
        if (this.value == card.getValue()) {
            return this.suit - card.getSuit();
        } else {
            return this.value - card.getValue();
        }
    }
}
