package model;

public enum CardSuit {
    SPADE("SPADE"),
    CLUB("CLUB"),
    DIAMOND("DIAMOND"),
    HEART("HEART");

    private String name;

    private CardSuit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
