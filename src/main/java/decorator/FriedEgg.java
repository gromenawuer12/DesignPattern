package decorator;

public class FriedEgg implements TopicDecorator{
    Burguer burguer;

    public FriedEgg(Burguer burguer){
        this.burguer=burguer;
    }

    public String getDescription(){
        return burguer.getDescription() + ", Fried Egg";
    }

    public double cost(){
        return 0.75 + burguer.cost();
    }
}
