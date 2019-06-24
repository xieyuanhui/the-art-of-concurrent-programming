package chapter7;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author LitheLight
 * @date 2019/6/23
 */
public class AtomicIntegerTest {

    static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
    }
}
