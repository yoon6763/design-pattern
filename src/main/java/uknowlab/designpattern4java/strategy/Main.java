package uknowlab.designpattern4java.strategy;

public class Main {
    public static void main(String[] args) {

        Character character = new Character();
        character.setWeapon(new Archer());
        character.attack();

        character.setWeapon(new Attack() {
            @Override
            public void attack() {
                // Warrior
                System.out.println("검 무기 공격!");
            }
        });
    }
}
