package uknowlab.designpattern4java.decorator.condiment;

import uknowlab.designpattern4java.decorator.beverage.Beverage;

public abstract class ToppingDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
