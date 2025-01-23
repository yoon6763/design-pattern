package uknowlab.designpattern4java.strategy;

public class Archer implements Attack {
    @Override
    public void attack() {
        System.out.println("활 공격");
    }
}
