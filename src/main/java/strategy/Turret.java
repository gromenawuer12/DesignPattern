package strategy;

public class Turret extends Enemy{
    public Turret() {
        attackBehavior = new RangeAttack();
        movementBehavior = new NoMovement();
        deathBehavior = new Death();
    }
    public void display(){
        System.out.println("I'm a turret\n");
    }
}
