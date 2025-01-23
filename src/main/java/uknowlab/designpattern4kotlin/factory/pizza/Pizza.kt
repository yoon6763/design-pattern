package uknowlab.designpattern4kotlin.factory.pizza

abstract class Pizza {
    abstract fun prepare()

    abstract fun bake()

    abstract fun cut()

    abstract fun box()
}
