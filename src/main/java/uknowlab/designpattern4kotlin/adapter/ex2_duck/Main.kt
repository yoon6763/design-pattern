package uknowlab.designpattern4kotlin.adapter.ex2_duck

import uknowlab.designpattern4java.adapter.ex2_duck.Duck
import uknowlab.designpattern4java.adapter.ex2_duck.MallardDuck
import uknowlab.designpattern4java.adapter.ex2_duck.Turkey
import uknowlab.designpattern4java.adapter.ex2_duck.TurkeyAdapter
import uknowlab.designpattern4java.adapter.ex2_duck.WildTurkey

fun main() {
    val duck: Duck = MallardDuck()

    val turkey: Turkey = WildTurkey()
    val turkeyAdapter: Duck = TurkeyAdapter(turkey)

    println("칠면조가 말합니다")
    turkey.gobble()
    turkey.fly()

    println()
    println("오리가 말합니다")
    testDuck(duck)

    println()
    println("칠면조가 어댑터가 말합니다")
    testDuck(turkeyAdapter)
}

fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}