package playersTest;

import characters.players.Khajit;
import characters.players.Modifiers;
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


    @Test
    public void khajitHasMagicPoints(){
        assertEquals(100, khajit1.getMagic(), 0.0);
    }

    @Test
    public void khajitHasBaseMeleeDmg(){
        assertEquals(1.2, khajit1.getMeleeDmg(), 0.0);
    }

    @Test
    public void khajitHasBaseRangeDmg(){
        assertEquals(1.4, khajit1.getRangeDmg(), 0.0);
    }

    @Test
    public void khajitHasBaseMagicDmg(){
        assertEquals(1.0, khajit1.getMagicDmg(), 0.0);
    }

    @Test
    public void khajitHasPhysicalRes(){
        assertEquals(0.9, khajit1.getPRes(), 0.0);
    }

    @Test
    public void khajitHasMagicRes(){
        assertEquals(1.0, khajit1.getMRes(), 0.0);
    }

    @Test
    public void canTakeDamage() {
        khajit1.takeDamage(10);
        assertEquals(90, khajit1.getHealthPoints(), 0);
    }


}

