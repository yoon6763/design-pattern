package uknowlab.designpattern.decorator.beverage;

public class VanillaLatte extends Beverage {
    public VanillaLatte() {
        description = "바닐라라떼";
    }

    public int cost() {
        return 4000;
    }
}
