package strategy;

public abstract class Enemy {
    AttackBehavior attackBehavior;
    DeathBehavior deathBehavior;
    MovementBehavior movementBehavior;

    public Enemy(){}

    public abstract void display();

    public void performAttack(){
        attackBehavior.attack();
    }
    public void performDeath(){
        deathBehavior.death();
    }
    public void performMovement(){
        movementBehavior.movement();
    }
    public void setAttackBehavior(AttackBehavior ab){
        attackBehavior = ab;
    }
    public void setMovementBehavior(MovementBehavior mb){
            movementBehavior = mb;
    }
    public void setDeathBehavior(DeathBehavior db){
            deathBehavior = db;
    }
}
