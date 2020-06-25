import org.junit.Before;
import org.junit.Test;
import weapons.OneHandedSword;

import static org.junit.Assert.assertEquals;

public class OneHandedSwordTest {
    OneHandedSword dawnbreaker;

    @Before
    public void setup(){
        dawnbreaker = new OneHandedSword("Dawnbreaker", 50);
    }

    @Test
    public void canGetName(){
        assertEquals("Dawnbreaker", dawnbreaker.getName());
    }
    @Test
    public void canGetDamageValue(){
        assertEquals(50, dawnbreaker.getDamage(), 0);
    }


}
