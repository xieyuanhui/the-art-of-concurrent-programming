package chapter4;

public class Synchronized {

    public static void main(String[] args) {
        // 对Synchronized Class对象加锁
        synchronized(Synchronized.class) {
        }
        // 静态同步方法，对Synchronized Class对象加锁
        m();
    }

    public synchronized static void m() {
    }
}
