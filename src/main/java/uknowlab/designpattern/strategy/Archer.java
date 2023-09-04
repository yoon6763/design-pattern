package uknowlab.designpattern.strategy;

public class Archer implements Attack {
    @Override
    public void attack() {
        System.out.println("활 공격");
    }
}
