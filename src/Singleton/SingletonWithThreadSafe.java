package Singleton;

public class SingletonWithThreadSafe {
    private static volatile SingletonWithThreadSafe instance;
    private String data;

    private SingletonWithThreadSafe(String data) {
        this.data = data;
    }

    public static SingletonWithThreadSafe getInstance(String data) {
        if (instance == null) {
            synchronized (SingletonWithThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonWithThreadSafe(data);
                }
            }

        }
        return instance;
    }
}
