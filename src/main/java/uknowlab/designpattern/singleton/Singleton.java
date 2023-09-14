package uknowlab.designpattern.singleton;

public class Singleton {
    private static Singleton instance = null;

    private String name = "Singleton";

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
