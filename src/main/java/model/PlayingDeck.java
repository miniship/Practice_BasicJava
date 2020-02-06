package model;

public class PlayingDeck {

    private static final int NUM_OF_CARDS = 52;
    private static final String[] CARD_NAME_SET = new String[]{
            "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
    private static final String[] CARD_SUIT_SET = new String[] {
            "SPADE", "CLUB", "DIAMOND", "HEART"
    };

    private PlayingCard[] cardSet;

    {
        cardSet = new PlayingCard[NUM_OF_CARDS];
        int index = 0;
        for (int i = 1; i <= CARD_NAME_SET.length; i++) {
            for (String suit : CARD_SUIT_SET) {
                cardSet[index++] = new PlayingCard(CARD_NAME_SET[i - 1], i, suit);
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
