package uknowlab.designpattern.factory.pizza;

import uknowlab.designpattern.decorator.beverage.CafeLatte;

public abstract class Pizza {

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

}
