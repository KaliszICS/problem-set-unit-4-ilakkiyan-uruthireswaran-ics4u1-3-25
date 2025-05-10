import java.util.*;
public class Deck{
    private List<Card> cards;

    // List of Strings containing the names of cards and the value

    public final String[] suits = {"Hearts", "Clubs", "Diamond", "Spades"};
    public final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public final int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    // takes in list of cards and returns 
    public Deck() {
        this.cards = new ArrayList<Card>();
        for (int i = 0; i < this.suits.length; i++) {
            for (int j = 0; j < this.ranks.length; j++) {
                String suit = this.suits[i];
                String rank = this.ranks[j];
                int value = this.values[j];
                this.cards.add(new Card(suit, rank, value));
            }
        }  
    }

    public Deck(ArrayList<Card> deck) {
        this.cards = deck;
    }

    public int size() {
        return cards.size();
    }

    public Card draw() {
        if (this.size() == 0) {
            return null;
        }
       return cards.remove(0);
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }




}