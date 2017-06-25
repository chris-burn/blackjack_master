package deck;

/**
 * Created by user on 25/06/2017.
 */

public enum CardSuit {

        HEARTS("Hearts"),
        DIAMONDS("Diamonds"),
        SPADES("Spades"),
        CLUBS("Clubs");

        private String type;

        CardSuit(String type) {
            this.type = type;
        }

        public String getSuit() {
            return type;
        }
}


