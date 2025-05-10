import java.util.*;

public class Player{
    private String name;
    private int age;
    private ArrayList<Card> hand;

    public Player(String name, int age, ArrayList<Card> hand) {
        this.name = name;
        this.age = age;
        this.hand = hand;
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
        this.hand = new ArrayList<Card>();
    }



    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public Deck draw(Deck deck) {
        this.hand.add(deck.draw());
        return deck;
    }

    public boolean discardCard(Card card, DiscardPile discardPile) {
        for (int i = 0; i < this.hand.size(); i++) {
            if (this.hand.get(i).equals(card)) {
                discardPile.addCard(this.hand.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean returnCard(Card card, Deck deck) {
        for (int i = 0; i < this.hand.size(); i++) {
            if (this.hand.get(i).equals(card)) {
                deck.addCard(this.hand.remove(i));
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.name + " " + this.age + " ";
    }
}