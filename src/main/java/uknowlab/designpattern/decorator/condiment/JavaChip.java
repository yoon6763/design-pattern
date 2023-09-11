package uknowlab.designpattern.decorator.condiment;

import uknowlab.designpattern.decorator.beverage.Beverage;

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
