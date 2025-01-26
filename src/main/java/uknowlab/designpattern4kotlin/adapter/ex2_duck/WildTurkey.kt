package uknowlab.designpattern4kotlin.adapter.ex2_duck

import uknowlab.designpattern4java.adapter.ex2_duck.Turkey

class WildTurkey : Turkey {
    override fun gobble() {
        println("골골")
    }

    override fun fly() {
        println("짧은 거리를 날고 있어요")
    }
}
