package uknowlab.designpattern4kotlin.observer.exam2

fun main() {
    val company = Company()
    val customer = Customer(company)

    customer.sendMail("안녕하세요")
}