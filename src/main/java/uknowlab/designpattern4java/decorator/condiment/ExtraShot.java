package uknowlab.designpattern4java.decorator.condiment;

import uknowlab.designpattern4java.decorator.beverage.Beverage;

public class ExtraShot extends ToppingDecorator {

    public ExtraShot(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 샷 추가";
    }

    public int cost() {
        return beverage.cost() + 500;
    }
}
