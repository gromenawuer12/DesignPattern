package strategy;

public class NoDeath implements DeathBehavior{
    public void death() {
        System.out.println("I can't die!");
    }
}