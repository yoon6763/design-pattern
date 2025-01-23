package uknowlab.designpattern4java.strategy;

public class Warrior implements Attack{
    @Override
    public void attack() {
        System.out.println("검 공격");
    }
}
