package chapter7;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author LitheLight
 * @date 2019/6/23
 */
public class AtomicReferenceTest {

    public static AtomicReference<User> atomicReference = new AtomicReference<>();

    public static void main(String[] args) {
        User user = new User("xyh", 25);
        atomicReference.set(user);
        User updateUser = new User("myy", 18);
        atomicReference.compareAndSet(user, updateUser);
        System.out.println(atomicReference.get().getName());
        System.out.println(atomicReference.get().getAge());
    }

    static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
