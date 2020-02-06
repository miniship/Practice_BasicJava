package model;

public class PlayingCard {
    private String name;
    private int rank;
    private String suit;

    public PlayingCard() {
    }

    public PlayingCard(String name, int rank, String suit) {
        this.name = name;
        this.rank = rank;
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
