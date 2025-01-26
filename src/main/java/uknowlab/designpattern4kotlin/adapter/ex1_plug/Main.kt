package uknowlab.designpattern4kotlin.adapter.ex1_plug

import uknowlab.designpattern4java.adapter.ex1_plug.Plug110V
import uknowlab.designpattern4java.adapter.ex1_plug.Plug220V
import uknowlab.designpattern4java.adapter.ex1_plug.PlugAdaptor
import uknowlab.designpattern4java.adapter.ex1_plug.PlugInterface

fun main() {
    val plug110V_adept: PlugInterface = PlugAdaptor(Plug110V())
    plug110V_adept.plugIn()

    val plug220V: PlugInterface = Plug220V()
    plug220V.plugIn()

    plugInTest(plug110V_adept)
    plugInTest(plug220V)
}

fun plugInTest(plugInterface: PlugInterface) {
    plugInterface.plugIn()
}

