package uknowlab.designpattern4kotlin.factory

import uknowlab.designpattern4kotlin.factory.pizza.NYCheesePizza
import uknowlab.designpattern4kotlin.factory.pizza.NYPepperoniPizza
import uknowlab.designpattern4kotlin.factory.pizza.NYVeggiePizza
import uknowlab.designpattern4kotlin.factory.pizza.Pizza


class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String?): Pizza {
        return when (type) {
            "cheese" -> NYCheesePizza()
            "pepperoni" -> NYPepperoniPizza()
            "veggie" -> NYVeggiePizza()
            else -> NYCheesePizza()
        }
    }
}
