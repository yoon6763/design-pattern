package uknowlab.designpattern4kotlin.strategy

class Character {
    var attack: Attack? = null

    fun setWeapon(attack: Attack?) {
        this.attack = attack
    }

    fun attack() {
        attack!!.attack()
    }
}
