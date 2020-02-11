package model;

public enum CardRank {
    ACE("ACE"),
    TWO("TWO"),
    THREE("THREE"),
    FOUR("FOUR"),
    FIVE("FIVE"),
    SIX("SIX"),
    SEVEN("SEVEN"),
    EIGHT("EIGHT"),
    NINE("NINE"),
    TEN("TEN"),
    JACK("JACK"),
    QUEEN("QUEEN"),
    KING("KING");

    private String name;

    private CardRank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}