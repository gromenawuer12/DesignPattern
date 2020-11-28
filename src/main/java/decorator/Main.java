package decorator;

public class Main {
    public static void main(String[] args) {
        Burguer vealBurguer = new VealBurguer();
        System.out.println(vealBurguer.getDescription()+" "+vealBurguer.cost()+"€");

        Burguer chickenBurguer = new ChickenBurguer();
        System.out.println(chickenBurguer.getDescription()+" "+chickenBurguer.cost()+"€");

        Burguer chickenCheeseBurguer = new ChickenBurguer();
        chickenCheeseBurguer = new Cheese(chickenCheeseBurguer);
        System.out.println(chickenCheeseBurguer.getDescription()+" "+chickenCheeseBurguer.cost()+"€");

        Burguer vealCheeseFriedEggBurguer = new ChickenBurguer();
        vealCheeseFriedEggBurguer = new Cheese(vealCheeseFriedEggBurguer);
        vealCheeseFriedEggBurguer = new FriedEgg(vealCheeseFriedEggBurguer);
        System.out.println(vealCheeseFriedEggBurguer.getDescription()+" "+vealCheeseFriedEggBurguer.cost()+"€");

    }
}
