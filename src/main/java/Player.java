import java.util.ArrayList;

public class Player {
    private String name;
//    private ArrayList<Card> playerCard;
     private Card playerCard;

            public Player(String name){
        this.name = name;
        this.playerCard = null;
            }


    public void receiveCardFromDeck(Deck deck) {
           Card card = deck.dealCard();
           this.playerCard = card;
    }

    public Card getCard() {
           return this.playerCard;
    }
}
