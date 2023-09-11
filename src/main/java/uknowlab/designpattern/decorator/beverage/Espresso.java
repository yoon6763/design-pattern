package uknowlab.designpattern.decorator.beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    public double cost() {
        return 2000;
    }
}
