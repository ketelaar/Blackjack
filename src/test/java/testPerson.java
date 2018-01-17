
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class testPerson {
    @Test
    void testTotal() {
        Person p = new Person();
        Card c1 = p.getHand().get(0);
        Card c2 = p.getHand().get(1);
        assertEquals(p.getTotal(), c1.getValue() + c2.getValue());
    }


}
