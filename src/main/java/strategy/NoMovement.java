package strategy;

public class NoMovement implements MovementBehavior{
    public void movement() {
        System.out.println("I can't move!");
    }
}
