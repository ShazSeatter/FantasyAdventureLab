import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.fighter.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    WeaponType weaponType;

    @Before
    public void before(){
    barbarian = new Barbarian("Conan", 200, WeaponType.SWORD);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, barbarian.getHealthPoints());
    }

    @Test
    public void yieldWeapon() {
        assertEquals("Sword", barbarian.getWeaponType().getName());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeaponType(WeaponType.AXE);
        assertEquals("Axe", barbarian.getWeaponType().getName());
    }

}
