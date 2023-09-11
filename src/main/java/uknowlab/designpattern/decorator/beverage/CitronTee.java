package uknowlab.designpattern.decorator.beverage;

public class CitronTee extends Beverage {
    public CitronTee() {
        description = "유자차";
    }

    public int cost() {
        return 2000;
    }
}