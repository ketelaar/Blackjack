import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class testCard {
    @Test
    void testAce() {
        Card c = new Card();
        assertEquals(c.getValue() == 11, c.isAce());
    }

    @Test
    void testSuit() {
        Card c = new Card();
        ArrayList<String> suits = new ArrayList<>();
        suits.add("Diamonds");
        suits.add("Hearts");
        suits.add("Clubs");
        suits.add("Spades");
        if (suits.contains(c.getSuit())) {
            assertTrue(true);
        } else {
            fail();
        }
    }

    @Test
    void testValue() {
        Card c = new Card();
        assertTrue(c.getValue() < 12);
    }

    @Test
    void testprintCardValue() {
        Card c = new Card();
        if (c.isAce()) {
            assertEquals(c.printCardValue(), "an Ace of " + c.getSuit());
        } else {
            assertEquals(c.printCardValue(), "a " + c.getValue() + " of " + c.getSuit());
        }
    }
}
