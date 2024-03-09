package uknowlab.designpattern.factory;

import uknowlab.designpattern.factory.pizza.CheesePizza;
import uknowlab.designpattern.factory.pizza.PepperoniPizza;
import uknowlab.designpattern.factory.pizza.Pizza;
import uknowlab.designpattern.factory.pizza.VeggiePizza;

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