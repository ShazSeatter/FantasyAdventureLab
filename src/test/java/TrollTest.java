import org.junit.Before;
import org.junit.Test;
import players.enemies.Troll;


import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll("Holger", 200);
    }

    @Test
    public void playerHasName(){
        assertEquals("Holger", troll.getName());
    }

    @Test
    public void playerHasHealthPoints(){
        assertEquals(200, troll.getHealthPoints());
    }



}
