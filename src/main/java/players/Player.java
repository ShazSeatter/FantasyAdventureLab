package players;

import behaviours.ITakeDamage;

public abstract class Player implements ITakeDamage {

    private String name;
    private int healthPoints;


    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }


    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void reduceHealth(int amount) {
        healthPoints -= amount;
    }

    // damageTaken(damageValue IAttack ) - healthPoints(Player player)
}
