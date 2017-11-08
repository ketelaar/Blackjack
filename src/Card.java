import java.util.Random;

class Card {
    private int value;

    Card() {
        Random random = new Random();
        while (value == 0){
            this.value = random.nextInt(12);
        }
    }

    int getValue() {
        return this.value;
    }


}
