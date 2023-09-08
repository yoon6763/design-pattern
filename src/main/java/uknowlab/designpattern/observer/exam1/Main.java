package uknowlab.designpattern.observer.exam1;

public class Main {
    public static void main(String[] args) {
        ObservableInt observableInt = new ObservableInt(0);

        Person person1 = new Person("철수");
        Person person2 = new Person("영희");
        Person person3 = new Person("민수");

        observableInt.addSubscriber(person1);
        observableInt.addSubscriber(person2);
        observableInt.addSubscriber(person3);

        observableInt.setValue(10);
        observableInt.setValue(20);
        observableInt.setValue(30);

        observableInt.addSubscriber(new Subscriber() {
            @Override
            public void notifyUpdated(int value) {
                System.out.println("업데이트 되었습니다!" + value);
            }
        });

        observableInt.setValue(40);
    }
}
