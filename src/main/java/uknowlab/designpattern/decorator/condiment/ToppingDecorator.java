package uknowlab.designpattern.decorator.condiment;

import uknowlab.designpattern.decorator.beverage.Beverage;

public abstract class ToppingDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
