package uknowlab.designpattern4kotlin.observer.exam1

interface Subscriber {
    fun notifyUpdated(value: Int)
}