package uknowlab.designpattern4java.factory;

import uknowlab.designpattern4java.factory.pizza.NYCheesePizza;
import uknowlab.designpattern4java.factory.pizza.NYPepperoniPizza;
import uknowlab.designpattern4java.factory.pizza.NYVeggiePizza;
import uknowlab.designpattern4java.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYCheesePizza();
            case "pepperoni" -> new NYPepperoniPizza();
            case "veggie" -> new NYVeggiePizza();
            default -> null;
        };
    }
}
