import character.Breton;
import character.Modifiers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BretonTest {
    Breton breton1;

    @Before
    public void before(){
        breton1 = new Breton("Soyinka", Modifiers.BRETON);
    }

    @Test
    public void bretonHasAName(){
        assertEquals("Soyinka", breton1.getName());
    }

    @Test
    public void bretonHasHealthPoints(){
        assertEquals(100, breton1.getHealthPoints(), 0);
    }

    @Test
    public void bretonHasStaminaPoints(){
        assertEquals(80, breton1.getStamina(), 0);
    }

    @Test
    public void bretonHasMagicPoints(){
        assertEquals(150, breton1.getMagic(), 0.0);
    }

    @Test
    public void bretonHasBaseMeleeDmg(){
        assertEquals(0.7, breton1.getBaseMeleeDmg(), 0.0);
    }

    @Test
    public void bretonHasBaseRangeDmg(){
        assertEquals(1.8, breton1.getBaseRangeDmg(), 0.0);
    }

    @Test
    public void bretonHasBaseMagicDmg(){
        assertEquals(0.7, breton1.getBaseMagicDmg(), 0.0);
    }
    
    @Test
    public void bretonHasPhysicalRes(){
        assertEquals(150, breton1.getPhysicalResistance(), 0.0);
    }

}
