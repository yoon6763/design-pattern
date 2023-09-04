package uknowlab.designpattern.observer;

public class Customer {

    Observable observable;

    public Customer(Observable observable) {
        this.observable = observable;
    }

    public void sendMail(String message) {
        observable.receiveMail(message);
    }
}
