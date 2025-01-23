package uknowlab.designpattern4kotlin.factory

import uknowlab.designpattern4kotlin.factory.pizza.Pizza

abstract class PizzaStore {
    fun orderPizza(type: String?): Pizza {
        val pizza: Pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    protected abstract fun createPizza(type: String?): Pizza
}
