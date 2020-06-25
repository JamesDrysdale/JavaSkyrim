package weaponsTest;

import org.junit.Before;
import org.junit.Test;
import weapons.Bow;
import weapons.OneHandedSword;

import static org.junit.Assert.assertEquals;

public class BowTest {
    Bow bow;

    @Before
    public void setup(){
        bow = new Bow("Glass Bow of the Stag Prince", 30);
    }

    @Test
    public void canGetName(){
        assertEquals("Glass Bow of the Stag Prince", bow.getName());
    }
    @Test
    public void canGetDamageValue(){
        assertEquals(30, bow.getDamage(), 0);
    }


}
