package uknowlab.designpattern.strategy

fun main() {
    val character = Character()
    character.setWeapon {
        println("검 무기 공격!")
    }
    character.attack()
}