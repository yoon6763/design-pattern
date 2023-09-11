package uknowlab.designpattern.decorator.beverage;

public class CafeLatte extends Beverage {
    public CafeLatte() {
        description = "카페라떼";
    }

    public int cost() {
        return 3500;
    }
}
