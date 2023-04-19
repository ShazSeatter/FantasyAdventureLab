package players.enemies;
import players.Player;

public abstract class Enemy extends Player {
    public Enemy(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void takeDamage(int damage) {
        reduceHealth(damage);
    }
}
