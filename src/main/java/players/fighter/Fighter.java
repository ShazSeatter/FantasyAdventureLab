package players.fighter;

import behaviours.IAttack;
import behaviours.ITakeDamage;
import enums.WeaponType;
import players.Player;

public abstract class Fighter extends Player implements IAttack {

    private WeaponType weaponType;

    public Fighter(String name, int healthPoints, WeaponType weaponType) {

        super(name, healthPoints);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void attack(ITakeDamage target) {
        target.takeDamage(weaponType.getDamageValue());
    }

    @Override
    public void takeDamage(int damage) {
        reduceHealth(damage);
    }


}
