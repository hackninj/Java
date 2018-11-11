public class Card {
    //properties:
    private String suit;
    private String rank;
    //ctor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    //getters
    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }
    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
    public int getValue() {
        switch (rank) {
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            case "Ace":
                return 11;
            default:
                //parse the String to a number 2, 3, 4, 5,
                return Integer.valueOf(rank);

        }
    }
}
