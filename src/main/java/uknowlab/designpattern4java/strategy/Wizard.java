package uknowlab.designpattern4java.strategy;

public class Wizard implements Attack{
    @Override
    public void attack() {
        System.out.println("마법 공격");
    }
}
