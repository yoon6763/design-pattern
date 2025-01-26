package uknowlab.designpattern4kotlin.strategy

fun main() {
    val character = Character()
    character.setWeapon(Archer())
    character.attack()
}