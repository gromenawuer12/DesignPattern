package template;

public class Main {
    public static void main(String[] args) {
       BuildVehicle motorcycle = new Motorcycle();
       BuildVehicle car = new Car();

       System.out.println("Motorcycle: ");
       motorcycle.assemblyLine();

       System.out.println("Car: ");
       car.assemblyLine();
    }
}
