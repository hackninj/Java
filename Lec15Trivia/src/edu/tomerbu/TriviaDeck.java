package edu.tomerbu;

import java.util.ArrayList;
import java.util.List;

public class TriviaDeck {
    //properties:
    private List<TriviaCard> cards;

    //ctor:
    public TriviaDeck(List<TriviaCard> cards) {
        this.cards = cards;
    }
    //ctor:
    public TriviaDeck() {
        cards = new ArrayList<>();
    }

    //nextCard
    public TriviaCard nextCard(){
        return cards.remove(0);
    }

    //add a card to the list
    public void addCard(TriviaCard card){
        cards.add(card);
    }

    public void shuffle(){
        //fisher yates:
        for (int i = 0; i < cards.size(); i++) {
            int r = (int)Math.random()*cards.size(); // 0 < size //TODO: IO
            cards.add(r, cards.remove(i));//TODO
        }
    }
}
