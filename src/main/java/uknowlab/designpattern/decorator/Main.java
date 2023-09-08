package uknowlab.designpattern.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("주문: " + espresso.getDescription() + ", 가격: $" + espresso.getPrice());

        Coffee espressoWithMilk = new MilkDecorator(new Espresso());
        System.out.println("주문: " + espressoWithMilk.getDescription() + ", 가격: $" + espressoWithMilk.getPrice());

    }
}
