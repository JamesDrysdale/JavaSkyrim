package characters.playersTest;

import characters.players.Breton;
import characters.players.Modifiers;
import org.junit.Before;
import org.junit.Test;
import weapons.OneHandedSword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class BretonTest {
    Breton breton1;
    Weapon dawnbreaker;

    @Before
    public void before(){
        dawnbreaker = new OneHandedSword("Dawnbreaker", 20);
        breton1 = new Breton("Soyinka", Modifiers.BRETON, dawnbreaker);
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
        assertEquals(0.7, breton1.getMeleeDmg(), 0.0);
    }

    @Test
    public void bretonHasBaseRangeDmg(){
        assertEquals(0.7, breton1.getRangeDmg(), 0.0);
    }

    @Test
    public void bretonHasBaseMagicDmg(){
        assertEquals(1.8, breton1.getMagicDmg(), 0.0);
    }

    @Test
    public void bretonHasPhysicalRes(){
        assertEquals(0.8, breton1.getPRes(), 0.0);
    }
    @Test
    public void bretonHasMagicRes(){
        assertEquals(1.2, breton1.getMRes(), 0.0);
    }

}
