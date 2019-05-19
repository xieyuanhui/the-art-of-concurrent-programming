package chapter3;

public class ReorderExample {

    int a = 0;
    boolean flag = false;

    public void writer() {
        a = 1;
        flag = true;
    }

    public int reader() {
        if (flag) {
            int i = a * a;
            return i;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReorderExample example = new ReorderExample();
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
        t2.join();
        System.out.println("a = " + example.a);
    }
}
