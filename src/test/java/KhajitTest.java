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
    public void bretonHasAName(){
        assertEquals("M'aiq", khajit1.getName());
    }

}

