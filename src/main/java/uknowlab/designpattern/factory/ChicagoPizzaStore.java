package uknowlab.designpattern.factory;

import uknowlab.designpattern.factory.pizza.ChicagoCheesePizza;
import uknowlab.designpattern.factory.pizza.ChicagoPepperoniPizza;
import uknowlab.designpattern.factory.pizza.ChicagoVeggiePizza;
import uknowlab.designpattern.factory.pizza.Pizza;

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
