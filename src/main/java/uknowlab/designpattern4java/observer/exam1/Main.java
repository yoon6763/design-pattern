package uknowlab.designpattern4java.observer.exam1;

public class Main {
    public static void main(String[] args) {
        ObservableInt observableInt = new ObservableInt(0);

        observableInt.addSubscriber(new Subscriber() {
            @Override
            public void notifyUpdated(int value) {
                System.out.println("익명 클래스 : 업데이트 된 값을 받았어요 -> " + value);
            }
        });

        observableInt.setValue(1000);
        observableInt.setValue(2000);
        observableInt.setValue(3000);
    }
}