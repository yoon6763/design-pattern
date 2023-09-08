package uknowlab.designpattern.decorator;

public class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public int getPrice() {
        return decoratedCoffee.getPrice();
    }
}