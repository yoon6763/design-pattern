package uknowlab.designpattern4java.adapter.ex1_plug;

public class PlugAdaptor implements PlugInterface {

    private Plug110V plug110V;

    public PlugAdaptor(Plug110V plug110V) {
        this.plug110V = plug110V;
    }

    @Override
    public void plugIn() {
        plug110V.plugIn110V();
    }
}
