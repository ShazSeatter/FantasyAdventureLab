import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.enemies.Troll;
import players.fighter.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Troll troll;

    @Before
    public void before() {
        knight = new Knight("Tolly the Wild", 200, WeaponType.AXE);
    }

    @Test
    public void hasName() {
        assertEquals("Tolly the Wild", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, knight.getHealthPoints());
    }

    @Test
    public void canChangeWeapon() {
        knight.setWeaponType(WeaponType.CLUB);
        assertEquals("Club", knight.getWeaponType().getName());
    }

    @Test
    public void canAttackEnemy(){
        troll = new Troll("Holger", 200);
        knight.attack(troll);
        assertEquals(160, troll.getHealthPoints());
    }

}
