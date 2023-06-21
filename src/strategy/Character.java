package strategy;

public class Character {

    Attack attack;

    public void setWeapon(Attack attack) {
        this.attack = attack;
    }

    public void attack() {
        attack.attack();
    }
}
