package strategy;

public class Main {
    public static void main(String[] args) {
        Enemy slime = new Slime();
        slime.performDeath();
        slime.performAttack();
        slime.performMovement();
        slime.display();

        Enemy turret = new Turret();
        turret.performDeath();
        turret.performAttack();
        turret.performMovement();
        turret.display();

        Enemy spikes = new Spikes();
        spikes.performDeath();
        spikes.performAttack();
        spikes.performMovement();
        spikes.display();

        Enemy other = new Turret();
        other.performAttack();
        other.setAttackBehavior(new MeleeAttack());
        other.performAttack();
        other.display();

    }
}
