package uknowlab.designpattern4java.adapter.ex1_plug;

public class Plug220V implements PlugInterface {
    @Override
    public void plugIn() {
        System.out.println("110V 전원 연결");
    }
}
