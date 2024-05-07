package uknowlab.designpattern.adapter.ex1_plug;

public class Main {
    public static void main(String[] args) {
        PlugInterface plug110V_adept = new PlugAdaptor(new Plug110V());
        plug110V_adept.plugIn();

        PlugInterface plug220V = new Plug220V();
        plug220V.plugIn();

        plugInTest(plug110V_adept);
        plugInTest(plug220V);
    }

    static void plugInTest(PlugInterface plugInterface) {
        plugInterface.plugIn();
    }
}
