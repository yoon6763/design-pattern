package uknowlab.designpattern4java.observer.exam1;

public class Person implements Subscriber {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void notifyUpdated(int value) {
        System.out.println(name + " : 업데이트 된 값을 받았어요 -> " + value);
    }
}
