import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card;
    SuitType suitType;
    RankType rankType;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void deckHas52Cards(){
//        deck.populateDeck(suitType, rankType);
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canShuffleDeck(){
        deck.shuffleCards();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canDealCard(){
        Card dealtCard = deck.dealCard();
        assertEquals(51, deck.cardCount());
    }
}
