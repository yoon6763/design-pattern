package uknowlab.designpattern.adapter.ex2_duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말합니다");
        turkey.gobble();
        turkey.fly();

        System.out.println();
        System.out.println("오리가 말합니다");
        testDuck(duck);

        System.out.println();
        System.out.println("칠면조가 어댑터가 말합니다");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
