import java.util.Random;

class Card {
    private int value;
    private String suit;
    private Boolean ace = false;

    Card() {
        Random random = new Random();
        while (this.value == 0){
            this.value = random.nextInt(12);
        }
        if (this.value == 11) {
            this.ace = true;
        }
        int suitNumber = random.nextInt(4);
        switch (suitNumber) {
            case 0:
                this.suit = "Diamonds";
                break;
            case 1:
                this.suit = "Hearts";
                break;
            case 2:
                this.suit = "Clubs";
                break;
            default:
                this.suit = "Spades";
                break;
        }
    }

    String printCardValue() {
        if (this.ace) {
            return ("an Ace of " + this.suit);
        } else {
            return ("a " + this.value + " of " + this.suit);
        }
    }

    int getValue() {
        return this.value;
    }

    String getSuit() {
        return this.suit;
    }

    Boolean isAce() {
        return this.ace;
    }


}
