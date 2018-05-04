/*
package DesignPatterns.Factory_Design_Patterns;

public class PizzaFactory {


    private static PizzaFactory pizzaFactory = new PizzaFactory();

    public static Capriciosa getInstance() {

        if (pizzaFactory == null){

            pizzaFactory = new PizzaFactory();
    }

    public Pizza createPizza(){

        int pizzaNumber = 0;

        switch (pizzaNumber) {

            case 1:

                    return new Capriciosa();
            case 2:

                    return new Hawaii();

            case 3:

                    return new Salami();

            case 4:

                    return new Capriciosa();

        }

    }
}
*/
