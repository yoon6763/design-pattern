package uknowlab.designpattern4java.decorator.condiment;

import uknowlab.designpattern4java.decorator.beverage.Beverage;

public class JavaChip extends ToppingDecorator {

    public JavaChip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 자바칩";
    }

    public int cost() {
        return beverage.cost() + 700;
    }
}
