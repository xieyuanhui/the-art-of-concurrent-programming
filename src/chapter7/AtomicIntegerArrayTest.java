package chapter7;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author LitheLight
 * @date 2019/6/23
 */
public class AtomicIntegerArrayTest {

    static int[] value = new int[] {1, 2};
    static AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        atomicIntegerArray.getAndSet(0, 3);
        System.out.println(atomicIntegerArray.get(0));
        System.out.println(value[0]);
    }
}
