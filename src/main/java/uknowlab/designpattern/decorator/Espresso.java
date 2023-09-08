package uknowlab.designpattern.decorator;

public class Espresso implements Coffee {
    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return "에스프레소";
    }
}
