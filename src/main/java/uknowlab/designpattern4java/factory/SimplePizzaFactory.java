package uknowlab.designpattern4java.factory;

import uknowlab.designpattern4java.factory.pizza.CheesePizza;
import uknowlab.designpattern4java.factory.pizza.PepperoniPizza;
import uknowlab.designpattern4java.factory.pizza.Pizza;
import uknowlab.designpattern4java.factory.pizza.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "veggie" -> new VeggiePizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> null;
        };
    }
}