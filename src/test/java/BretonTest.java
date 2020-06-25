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
        assertEquals("Soyinka", breton.getName());
    }

}
