package uknowlab.designpattern.observer.exam1

fun main() {
    val observableInt = ObservableInt(4)
    observableInt.addSubscriber {
        println("Value changed to $it")
    }
    observableInt.value = 5


    val person1 = Person("John")
    val person2 = Person("Mary")

    observableInt.addSubscriber(person1)
    observableInt.addSubscriber(person2)

    observableInt.value = 6
    observableInt.value = 7
}