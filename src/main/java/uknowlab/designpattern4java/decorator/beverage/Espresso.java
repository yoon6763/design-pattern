package uknowlab.designpattern4java.decorator.beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    public int cost() {
        return 2500;
    }
}
