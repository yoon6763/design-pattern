package uknowlab.designpattern.decorator.condiment;

import uknowlab.designpattern.decorator.beverage.Beverage;

public class Whip extends ToppingDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }

    public int cost() {
        return beverage.cost() + 600;
    }
}
