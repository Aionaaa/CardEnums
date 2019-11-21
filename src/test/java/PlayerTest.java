import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlayerTest {
    private Player player;
    private Card card;
    private Deck deck;

    @Before
    public void before(){
        player = new Player("Zsolt");
        deck = new Deck();
        deck.populateDeck();
    }

    @Test
    public void playerDealtCard(){
        player.receiveCardFromDeck(deck);
        assertNotNull(player.getCard());

    }


}
