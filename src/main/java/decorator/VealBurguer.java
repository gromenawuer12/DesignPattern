package decorator;

public class VealBurguer implements Burguer {
    public String getDescription() {
        return "Veal";
    }

    public double cost(){
        return 6.5;
    }
}
