package template;

public abstract class BuildVehicle {
    final void assemblyLine(){
        design();
        bodywork();
        painting();
        assembly();
        delivery();
        if(customerAdditionalFeatures()) addAdditionalFeatures();
    }

    abstract void addAdditionalFeatures();

    abstract void design();

    abstract void bodywork();

    void painting(){
        System.out.println("The vehicle has been painted.");
    }
    void assembly(){
        System.out.println("The vehicle has been assembled.");
    }
    void delivery(){
        System.out.println("The vehicle has been delivered.");
    }
    boolean customerAdditionalFeatures() {
        return false;
    }
}
