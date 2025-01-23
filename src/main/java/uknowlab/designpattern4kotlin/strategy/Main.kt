package uknowlab.designpattern4java.strategy

import uknowlab.designpattern4kotlin.strategy.Archer
import uknowlab.designpattern4kotlin.strategy.Attack
import uknowlab.designpattern4kotlin.strategy.Character

fun main() {
    val character = Character()
    character.setWeapon(Archer())
    character.attack()

    character.setWeapon(object : Attack {
        override fun attack() {
            // Warrior
            println("검 무기 공격!")
        }
    })
}
