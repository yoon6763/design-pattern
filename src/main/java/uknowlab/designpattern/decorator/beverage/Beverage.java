package uknowlab.designpattern.decorator.beverage;

public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
