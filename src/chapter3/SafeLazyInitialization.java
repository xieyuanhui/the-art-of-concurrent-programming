package chapter3;

public class SafeLazyInitialization {

    private static SafeLazyInitialization instance;

    public synchronized static SafeLazyInitialization getInstance() {
        if (instance == null) {                           //A线程执行
            instance = new SafeLazyInitialization();    //B线程执行
        }
        return instance;
    }
}
