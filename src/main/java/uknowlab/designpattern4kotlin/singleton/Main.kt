package uknowlab.designpattern4kotlin.singleton

import uknowlab.designpattern4java.singleton.KotlinSingleton
import uknowlab.designpattern4java.singleton.MySingleton

fun main() {
    singletonTest()
    multiThreadSingletonTest()
    kotlinSingletonTest()
    kotlinMultiThreadSingletonTest()
}

fun singletonTest() {
    val mySingleton1 = MySingleton.getInstance()
    val mySingleton2 = MySingleton.getInstance()

    println(mySingleton1)
    println(mySingleton2)
    println(mySingleton1 === mySingleton2) // true
}

fun multiThreadSingletonTest() {
    for (i in 0..9) {
        val thread = Thread {
            val mySingleton = MySingleton.getInstance()
            println(mySingleton) // 서로 다른 주소값이 출력 될 수도 있음
        }
        thread.start()
    }
}

fun kotlinSingletonTest() {
    println(KotlinSingleton)
    println(KotlinSingleton)
}

fun kotlinMultiThreadSingletonTest() {
    for (i in 0..9) {
        val thread = Thread {
            val kotlinSingleton = KotlinSingleton
            println(kotlinSingleton)
        }
        thread.start()
    }
}
