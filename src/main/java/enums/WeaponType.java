package enums;

public enum WeaponType {
    SWORD("Sword", 50),
    AXE("Axe", 40),
    CLUB("Club", 30);

    private final String name;
    private final int damageValue;

    WeaponType(String name, int damageValue ) {
        this.name = name;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
