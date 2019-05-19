package chapter3;

public class SynchronizedExample {

    int a = 0;
    boolean flag = false;

    public synchronized void writer() {
        a = 1;
        flag = true;
    }

    public synchronized int reader() {
        if (flag) {
            int i = a * a;
            return i;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample example = new SynchronizedExample();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.writer();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.reader();
            }
        });
        t1.start();
        t2.start();
        System.out.println("a = " + example.a);
    }
}
