package uknowlab.designpattern.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 우유";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }
}
