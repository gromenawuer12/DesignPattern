package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Motorcycle extends BuildVehicle{
    public void design(){
        System.out.println("Motorcycle design.");
    }

    public void bodywork(){
        System.out.println("The motorcycle body has been manufactured.");
    }
    public void addAdditionalFeatures(){
        System.out.println("Radio has been added to the motorcycle.");
    }
    public boolean customerAdditionalFeatures() {
        String input = getUserInput();
        if (input.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
    private String getUserInput() {
        String input = null;
        System.out.print("Does the customer want radio in the motorcycle?? (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (input == null) {
            return "n";
        }
        return input;
    }
}
