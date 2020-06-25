package enemiesTest;

import characters.enemies.Skeever;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkeeverTest {
    Skeever skeever;

    @Before
    public void before(){
        skeever = new Skeever("Skeet", 10, 1.2, 0.0, 0.0);
    }

    @Test
    public void canHaveName(){
        assertEquals("Skeet", skeever.getName());
    }
    
    @Test
    public void canGetHealth(){
            assertEquals(10, skeever.getHP(), 0);
        }

    @Test
    public void canGetMeleeDmg(){
        assertEquals(1.2, skeever.getMeleeDmg(), 0.0);
    }

    @Test
    public void otherDmgis0(){
        assertEquals(0, skeever.getRangeDmg(), 0);
        assertEquals(0, skeever.getMagicDmg(), 0);
    }

    @Test
    public void canTakeDamage() {
        skeever.takeDamage(1);
        assertEquals(9, skeever.getHP(), 0);
    }
}
