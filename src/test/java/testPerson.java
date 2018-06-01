
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


class testPerson {
    @Test
    void testTotal() {
        Person p = new Person();
        Card c1 = p.getHand().get(0);
        Card c2 = p.getHand().get(1);
        assertEquals(p.getTotal(), c1.getValue() + c2.getValue());
    }

    @Test
    void testStay() {
        Person p = new Person();
        p.stay();
        assertFalse(p.isPlaying());
    }

    @Test
    void testSetPlaying() {
        Person p = new Person();
        p.setPlaying();
        assertTrue(p.isPlaying());
    }

    @Test
    void testHit() {
        Person p = new Person();
        final int SEED = 42;
        final int LIMIT = 1000000;
        Random random = new Random(SEED);
        int randInt = random.nextInt(LIMIT);
        for (int i = 0; i < randInt; i++) {
            p.hit(true);
        }
        assertEquals(p.getHand().size(), randInt + 2);
    }


}
