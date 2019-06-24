package chapter8;

import java.util.concurrent.CyclicBarrier;

/**
 * @author LitheLight
 * @date 2019/6/23
 */
public class CycleBarrierTest3 {

    static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.interrupt();
        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            System.out.println(cyclicBarrier.isBroken());
            e.printStackTrace();
        }
    }
}
