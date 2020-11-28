package decorator;

public class ChickenBurguer implements Burguer{
    public String getDescription() {
        return "Chicken";
    }

    public double cost(){
        return 4.5;
    }
}
