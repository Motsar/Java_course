import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> hand= new ArrayList<>();

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }

    public void sort(){
        Collections.sort(this.hand);
    }


    @Override
    public int compareTo(Hand hand) {
        return this.handValue() - hand.handValue();
    }
    public int handValue() {
        int totalValue = 0;
        for (Card card : this.hand) {
            totalValue += card.getValue();
        }
        return totalValue;
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}

