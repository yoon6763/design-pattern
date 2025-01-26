package uknowlab.designpattern4kotlin.adapter.ex1_plug

import uknowlab.designpattern4java.adapter.ex1_plug.PlugInterface

class PlugAdaptor(private val plug110V: Plug110V) : PlugInterface {
    override fun plugIn() {
        plug110V.plugIn110V()
    }
}
