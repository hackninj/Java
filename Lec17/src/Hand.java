import java.util.ArrayList;
import java.util.List;

public class Hand {
    //properties
    private List<Card> cards = new ArrayList<>();

    //methods:
    public void addCard(Card card) {
        cards.add(card);
    }



    public int getValue() {
        int sum = 0;
        int aceCount = 0;

        for (Card c : cards) {
            sum += c.getValue();
            if (c.getValue() == 11)
                aceCount++;
        }

        //handle aces:
        while (sum > 21 && aceCount > 0) {
            aceCount--;
            sum -= 10;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                '}';
    }
}
