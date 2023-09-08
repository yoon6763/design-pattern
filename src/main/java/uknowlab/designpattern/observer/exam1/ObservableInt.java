package uknowlab.designpattern.observer.exam1;

import java.util.ArrayList;
import java.util.List;

public class ObservableInt {
    private int value;

    private final List<Subscriber> subscribers;

    public ObservableInt(int value) {
        this.value = value;
        subscribers = new ArrayList<>();
    }

    public void setValue(int value) {
        this.value = value;
        subscribers.forEach(subscriber -> subscriber.notifyUpdated(value));
    }

    public int getValue() {
        return value;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
}
