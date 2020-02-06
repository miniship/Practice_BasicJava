package languagebasics;

import model.PlayingCard;
import model.PlayingDeck;
import org.junit.Assert;
import org.junit.Test;

public class PlayingDeckTest {


    @Test
    public void playingDeckConstructorTest() {
        PlayingDeck playingDeck = new PlayingDeck();
        PlayingCard[] cardSet = playingDeck.getCardSet();

        Assert.assertEquals(52, cardSet.length);
    }
}