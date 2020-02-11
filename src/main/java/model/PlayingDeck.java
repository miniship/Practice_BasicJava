package model;

public class PlayingDeck {

    private static final int NUM_OF_CARDS = 52;

    private PlayingCard[] cardSet;

    public PlayingDeck() {
        cardSet = new PlayingCard[NUM_OF_CARDS];
        int index = 0;
        for (CardRank rank : CardRank.values()) {
            for (CardSuit suit : CardSuit.values()) {
                cardSet[index++] = new PlayingCard(rank, suit);
            }
        }
    }

    public PlayingCard[] getCardSet() {
        return cardSet;
    }

    public void setCardSet(PlayingCard[] cardSet) {
        this.cardSet = cardSet;
    }
}
