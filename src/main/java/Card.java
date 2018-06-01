import java.util.Random;

class Card {
    private int value;
    private String suit;

    Card() {
        Random random = new Random();
        while (value == 0){
            this.value = random.nextInt(12);
        }
        int suitNumber = random.nextInt(3);
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

    String getSuit() {
        return suit;
    }

    int getValue() {
        return this.value;
    }


}
