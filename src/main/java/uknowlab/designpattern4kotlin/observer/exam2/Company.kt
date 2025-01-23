package uknowlab.designpattern4kotlin.observer.exam2

import uknowlab.designpattern4java.observer.exam2.Observable

class Company : Observable {
    override fun receiveMail(message: String) {
        println("고객으로 부터 받은 메시지 : $message")
    }
}
