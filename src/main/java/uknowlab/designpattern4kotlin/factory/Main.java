package uknowlab.designpattern4kotlin.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        // 뉴욕 치즈 피자 주문
        Pizza nyCheesePizza = nyStore.orderPizza("cheese");

        // 시카고 veggie 피자 주문
        Pizza chicagoVeggiePizza = chicagoStore.orderPizza("veggie");
    }
}
