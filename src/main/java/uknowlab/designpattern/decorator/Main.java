package uknowlab.designpattern.decorator;

import uknowlab.designpattern.decorator.beverage.Beverage;
import uknowlab.designpattern.decorator.beverage.DarkRoast;
import uknowlab.designpattern.decorator.beverage.Espresso;
import uknowlab.designpattern.decorator.beverage.HouseBlend;
import uknowlab.designpattern.decorator.condiment.Mocha;
import uknowlab.designpattern.decorator.condiment.Soy;
import uknowlab.designpattern.decorator.condiment.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.cost() + "원");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.cost() + "원");

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " " + beverage3.cost() + "원");
    }
}
