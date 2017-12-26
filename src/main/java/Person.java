import java.util.ArrayList;

public class Person {
    private ArrayList<Card> hand = new ArrayList<>();
    private int total; // total value of all cards in the hand
    boolean playing;

    Person() {
        Card c1 = new Card();
        Card c2 = new Card();

        hand.add(c1);
        hand.add(c2);
    }

    boolean isPlaying() {
        return playing;
    }

    void setPlaying() {
        playing = true;
    }

    ArrayList<Card> getHand() {
        return hand;
    }

    int getTotal() {
        setTotal();
        return total;
    }

    private void setTotal() {
        int sum = 0;
        for (Card card : hand) {
            sum += card.getValue();
        }
        this.total = sum;
    }

    public void printTotal() {
        System.out.println("total is " + getTotal());
    }

    public void hit() {
        Card newCard = new Card();
        hand.add(newCard);
        System.out.println("drew a " + newCard.getValue() + " of " + newCard.getSuit());
    }

    void stay() {
        this.playing = false;
    }
}
