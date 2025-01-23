package uknowlab.designpattern4java.singleton;

public class Main {
    public static void main(String[] args) {
        singletonTest();
        multiThreadSingletonTest();
        kotlinSingletonTest();
        kotlinMultiThreadSingletonTest();
    }

    static void singletonTest() {
        MySingleton mySingleton1 = MySingleton.getInstance();
        MySingleton mySingleton2 = MySingleton.getInstance();

        System.out.println(mySingleton1);
        System.out.println(mySingleton2);
        System.out.println(mySingleton1 == mySingleton2); // true
    }

    static void multiThreadSingletonTest() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    MySingleton mySingleton = MySingleton.getInstance();
                    System.out.println(mySingleton); // 서로 다른 주소값이 출력 될 수도 있음
                }
            });
            thread.start();
        }
    }

    static void kotlinSingletonTest() {
        System.out.println(KotlinSingleton.INSTANCE);
        System.out.println(KotlinSingleton.INSTANCE);
    }

    static void kotlinMultiThreadSingletonTest() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    KotlinSingleton kotlinSingleton = KotlinSingleton.INSTANCE;
                    System.out.println(kotlinSingleton);
                }
            });
            thread.start();
        }
    }
}