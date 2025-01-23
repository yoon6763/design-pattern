package uknowlab.designpattern4kotlin.factory

import uknowlab.designpattern4kotlin.factory.pizza.CheesePizza
import uknowlab.designpattern4kotlin.factory.pizza.PepperoniPizza
import uknowlab.designpattern4kotlin.factory.pizza.Pizza
import uknowlab.designpattern4kotlin.factory.pizza.VeggiePizza


class SimplePizzaFactory {
    fun createPizza(type: String?): Pizza {
        return when (type) {
            "cheese" -> CheesePizza()
            "veggie" -> VeggiePizza()
            "pepperoni" -> PepperoniPizza()
            else -> throw IllegalArgumentException("No such pizza.")
        }
    }
}