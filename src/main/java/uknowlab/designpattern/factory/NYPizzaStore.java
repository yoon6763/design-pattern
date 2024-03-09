package uknowlab.designpattern.factory;

import uknowlab.designpattern.factory.pizza.NYCheesePizza;
import uknowlab.designpattern.factory.pizza.NYPepperoniPizza;
import uknowlab.designpattern.factory.pizza.NYVeggiePizza;
import uknowlab.designpattern.factory.pizza.Pizza;

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
