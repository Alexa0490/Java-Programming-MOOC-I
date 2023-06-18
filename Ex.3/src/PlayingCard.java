public class PlayingCard {
    private Rank rank;
    private Suit suit;

    public Rank getRank() {
        return rank;
    }

    public PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

