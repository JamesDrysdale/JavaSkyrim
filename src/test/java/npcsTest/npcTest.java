package npcsTest;

import characters.npcs.NPC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class npcTest {

    @Test
    public void canExpressRemorse(){
        NPC npc = new NPC();
        assertEquals("I used to be an adventurer like you, then I took an arrow in the knee.", npc.expressRemorse());
    }


}
