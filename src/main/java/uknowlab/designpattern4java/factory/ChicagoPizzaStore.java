package uknowlab.designpattern4java.factory;

import uknowlab.designpattern4java.factory.pizza.ChicagoCheesePizza;
import uknowlab.designpattern4java.factory.pizza.ChicagoPepperoniPizza;
import uknowlab.designpattern4java.factory.pizza.ChicagoVeggiePizza;
import uknowlab.designpattern4java.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoCheesePizza();
            case "pepperoni" -> new ChicagoPepperoniPizza();
            case "veggie" -> new ChicagoVeggiePizza();
            default -> null;
        };
    }
}
