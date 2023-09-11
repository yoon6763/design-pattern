package uknowlab.designpattern.decorator.beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "디카페인 커피";
    }

    public double cost() {
        return 1500;
    }
}
