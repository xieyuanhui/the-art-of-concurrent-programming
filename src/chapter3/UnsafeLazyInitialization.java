package chapter3;

public class UnsafeLazyInitialization {

    private static UnsafeLazyInitialization instance;

    public static UnsafeLazyInitialization getInstance() {
        if (instance == null) {                           //A线程执行
            instance = new UnsafeLazyInitialization();    //B线程执行
        }
        return instance;
    }
}
