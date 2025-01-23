package uknowlab.designpattern4kotlin.observer.exam1

class Person(private val name: String) : Subscriber {
    override fun notifyUpdated(value: Int) {
        println("$name : 업데이트 된 값을 받았어요 -> $value")
    }
}
