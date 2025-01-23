package uknowlab.designpattern4kotlin.observer.exam1

import java.util.function.Consumer


class ObservableInt(private var value: Int) {
    private val subscribers: MutableList<Subscriber> =
        ArrayList()

    fun setValue(value: Int) {
        this.value = value
        subscribers.forEach(Consumer { subscriber: Subscriber -> subscriber.notifyUpdated(value) })
    }

    fun getValue(): Int {
        return value
    }

    fun addSubscriber(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }
}
