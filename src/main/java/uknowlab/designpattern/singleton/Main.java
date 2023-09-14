package uknowlab.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setName("싱글톤");
        System.out.println(singleton.getName());

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setName("싱글톤 2");

        System.out.println(singleton.getName());
        System.out.println(singleton2.getName());
    }
}
