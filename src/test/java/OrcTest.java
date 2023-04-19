import org.junit.Before;
import org.junit.Test;
import players.enemies.Orc;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before() {
        orc = new Orc("Bugak", 200);
    }

    @Test
    public void playerHasName() {
        assertEquals("Bugak", orc.getName());
    }

    @Test
    public void playerHasHealthPoints() {
        assertEquals(200, orc.getHealthPoints());
    }
}
