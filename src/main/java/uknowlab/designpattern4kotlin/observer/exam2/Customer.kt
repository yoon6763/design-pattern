package uknowlab.designpattern4kotlin.observer.exam2

class Customer(private var observable: Observable) {
    fun sendMail(message: String?) {
        observable.receiveMail(message)
    }
}
