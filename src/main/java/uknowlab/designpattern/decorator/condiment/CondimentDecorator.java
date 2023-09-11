package uknowlab.designpattern.decorator.condiment;

import uknowlab.designpattern.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
