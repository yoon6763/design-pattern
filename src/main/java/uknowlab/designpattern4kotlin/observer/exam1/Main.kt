package uknowlab.designpattern4kotlin.observer.exam1

fun main() {
    val observableInt = ObservableInt(0)

    observableInt.addSubscriber { value -> println("익명 클래스 : 업데이트 된 값을 받았어요 -> $value") }

    observableInt.value = 1000
    observableInt.value = 2000
    observableInt.value = 3000
}