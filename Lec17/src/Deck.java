import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        String[] suits = {"♥", "♦", "♣", "♠"};

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        for (String rank : ranks) {
            for (String suit : suits) {
                cards.add(new Card(suit, rank));
            }
        }

    }

    public Card dealCard(){
        return cards.remove(0);
    }

    public void shuffle(){
        //TODO: you do it fischer yates algorithm
    }
}
