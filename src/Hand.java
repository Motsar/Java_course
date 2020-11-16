import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand{
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


}

