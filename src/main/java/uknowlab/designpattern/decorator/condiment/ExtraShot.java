package uknowlab.designpattern.decorator.condiment;

import uknowlab.designpattern.decorator.beverage.Beverage;

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
