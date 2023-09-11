package uknowlab.designpattern.decorator.condiment;

import uknowlab.designpattern.decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }

    public double cost() {
        return beverage.cost() + 300;
    }
}
