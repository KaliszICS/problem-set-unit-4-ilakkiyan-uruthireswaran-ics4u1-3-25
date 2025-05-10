import java.util.*;

public class DiscardPile{
    private List<Card> pileOfCards;

    public DiscardPile() {
        this.pileOfCards = new ArrayList<Card>();
    }

    public DiscardPile(ArrayList<Card> pileOfCards) {
        this.pileOfCards = pileOfCards;
    }

    public int size() {
        return pileOfCards.size();
    }

    public void addCard(Card card) {
        this.pileOfCards.add(card);
    }

    public Card removeCard(Card card1) {
        for (int i = 0; i < this.pileOfCards.size(); i++) {
            if (this.pileOfCards.get(i).equals(card1)) {
                return this.pileOfCards.remove(i);
            }
        }
        return null;
    }

    public List<Card> removeAll(Card card2) {
        List<Card> deckTemp = this.pileOfCards;
        this.pileOfCards = new ArrayList<Card>();
        return deckTemp;
    }

    public String toString() {
        String s1 = "";
        for (int i = 0; i < this.pileOfCards.size(); i++) {
            s1 = s1 + this.pileOfCards.get(i).toString() + ", ";
        }
        return s1;
    }

}