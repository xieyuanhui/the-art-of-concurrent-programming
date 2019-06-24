package chapter8;

import java.util.concurrent.CyclicBarrier;

/**
 * @author LitheLight
 * @date 2019/6/23
 */
public class CycleBarrierTest2 {

    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new A());

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (Exception e) {

            }
            System.out.println(1);
        }).start();;

        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }

    static class A implements Runnable {

        @Override
        public void run() {
            System.out.println(3);
        }
    }
}
