import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
        populateDeck();
    }


    public int cardCount() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void populateDeck() {
        for (SuitType suit: SuitType.values()) {
            for (RankType rank: RankType.values()){
                cards.add(new Card(suit, rank));
            }

        }
    }


    public void shuffleCards() {
       Collections.shuffle(this.cards);

    }

    public void dealCard() {
        this.cards.remove(0);
    }
}
