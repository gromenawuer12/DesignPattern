package strategy;

public class Spikes extends Enemy{
    public Spikes() {
        attackBehavior = new MeleeAttack();
        movementBehavior = new NoMovement();
        deathBehavior = new NoDeath();
    }
    public void display(){
        System.out.println("I'm a spikes\n");
    }
}
