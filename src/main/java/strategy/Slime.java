package strategy;

public class Slime extends Enemy {
    public Slime() {
        attackBehavior = new MeleeAttack();
        movementBehavior = new Movement();
        deathBehavior = new Death();
    }
    public void display(){
        System.out.println("I'm a slime\n");
    }
}
