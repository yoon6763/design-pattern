package uknowlab.designpattern.decorator.beverage;

public class Americano extends Beverage {
    public Americano() {
        description = "아메리카노";
    }

    public int cost() {
        return 3000;
    }
}
