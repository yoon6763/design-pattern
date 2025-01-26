package uknowlab.designpattern4kotlin.adapter.ex2_duck

import uknowlab.designpattern4java.adapter.ex2_duck.Duck
import uknowlab.designpattern4java.adapter.ex2_duck.Turkey

class TurkeyAdapter(var turkey: Turkey) : Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for (i in 0..4) {
            turkey.fly()
        }
    }
}
