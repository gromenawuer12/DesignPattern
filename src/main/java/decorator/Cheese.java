package decorator;

public class Cheese implements TopicDecorator{
    Burguer burguer;

    public Cheese(Burguer burguer){
        this.burguer=burguer;
    }

    public String getDescription(){
        return burguer.getDescription() + ", Cheese";
    }

    public double cost(){
        return 1.2 + burguer.cost();
    }
}
