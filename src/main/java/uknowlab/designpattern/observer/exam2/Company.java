package uknowlab.designpattern.observer.exam2;

public class Company implements Observable {
    @Override
    public void receiveMail(String message) {
        System.out.println("고객으로 부터 받은 메시지 : " + message);
    }
}
