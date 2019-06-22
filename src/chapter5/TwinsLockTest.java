package chapter5;

import chapter4.SleepUtils;
import org.junit.Test;

import java.util.concurrent.locks.Lock;

/**
 * 共享式同步状态获取
 */
public class TwinsLockTest {

    @Test
    public void test() {
        final Lock lock = new TwinsLock();
        class Worker extends Thread {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        SleepUtils.second(1);
                        System.out.println(Thread.currentThread().getName());
                        SleepUtils.second(1);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }
        int threadNum = 10;
        // 启动10个线程
        for (int i = 0; i < threadNum; i++) {
            Worker w = new Worker();
            w.setDaemon(true);
            w.start();
        }
        // 每隔1秒换行
        for (int i = 0; i < threadNum; i++) {
            SleepUtils.second(1);
            System.out.println();
        }
    }
}
