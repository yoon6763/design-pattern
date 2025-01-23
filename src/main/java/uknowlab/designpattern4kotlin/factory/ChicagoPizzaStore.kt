package uknowlab.designpattern4kotlin.factory

import uknowlab.designpattern4kotlin.factory.pizza.ChicagoCheesePizza
import uknowlab.designpattern4kotlin.factory.pizza.ChicagoPepperoniPizza
import uknowlab.designpattern4kotlin.factory.pizza.ChicagoVeggiePizza
import uknowlab.designpattern4kotlin.factory.pizza.Pizza

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String?): Pizza {
        return when (type) {
            "cheese" -> ChicagoCheesePizza()
            "pepperoni" -> ChicagoPepperoniPizza()
            "veggie" -> ChicagoVeggiePizza()
            else -> throw IllegalArgumentException("No such pizza.")
        }
    }
}
