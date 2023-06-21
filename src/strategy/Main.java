package strategy;

public class Main {
    public static void main(String[] args) {

        java.lang.Character character = new java.lang.Character();
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
