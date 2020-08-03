package ayala.bartal.concentration.game.entities;

public class Card {
	
    private int cardId;
    private int pairId;
    private String content;
    
    public Card(int cardId, int pairId, String content) {
    	this.cardId = cardId;
    	this.pairId = pairId;
    	this.content = content;
    }
    
    public int getCardId() {
        return cardId;
    }

    public int getPairId() {
        return pairId;
    }

    public String getContent() {
        return content;
    }
}
