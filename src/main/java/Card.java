public class Card {
    // These three variables takes three values as parameters while playing
    private String name;
    private String suit;
    private int value;

    // "this" statement eliminates confusions between other classes
    public Card(String name, String suit, int value) {
        this.name = name;
        this.suit = suit;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    public String convertToString(int value) {
        return Integer.toString(value);
    }

    // returns name of card for example "Queen of Diamonds"
    public String toString() {
        return this.name + " of " + this.suit;
    }

    public boolean equals(Object obj) {
        // determines if 2 cards got same name, suits and values
        if (this == obj) {
            return true;
        }
        // if it have all same inputs return true, if not false
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card other = (Card) obj;
        return this.name.equals(other.name) && this.suit.equals(other.suit) && this.value == other.value;
        

    }
}