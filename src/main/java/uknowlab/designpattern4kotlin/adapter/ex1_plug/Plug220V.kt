package uknowlab.designpattern4kotlin.adapter.ex1_plug

import uknowlab.designpattern4java.adapter.ex1_plug.PlugInterface

class Plug220V : PlugInterface {
    override fun plugIn() {
        println("110V 전원 연결")
    }
}
