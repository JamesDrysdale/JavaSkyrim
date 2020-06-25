import character.Khajit;
import character.Modifiers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KhajitTest {

    Khajit khajit1;

    @Before
    public void before(){
        khajit1 = new Khajit("M'aiq", Modifiers.KHAJIT);
    }

    @Test
    public void khajitHasAName(){
        assertEquals("M'aiq", khajit1.getName());
    }

    @Test
    public void khajitHasHealthPoints(){
        assertEquals(100, khajit1.getHealthPoints(), 0);
    }

    @Test
    public void khajitHasStaminaPoints(){
        assertEquals(130, khajit1.getStamina(), 0);
    }

}

