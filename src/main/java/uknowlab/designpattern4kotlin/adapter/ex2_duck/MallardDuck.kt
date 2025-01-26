package uknowlab.designpattern4kotlin.adapter.ex2_duck

import uknowlab.designpattern4java.adapter.ex2_duck.Duck

class MallardDuck : Duck {
    override fun quack() {
        println("꽥")
    }

    override fun fly() {
        println("날고 있어요")
    }
}
