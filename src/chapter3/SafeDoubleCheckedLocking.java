package chapter3;

public class SafeDoubleCheckedLocking {                         //1

    private volatile static SafeDoubleCheckedLocking instance;           //2

    public static SafeDoubleCheckedLocking getInstance() {      //3
        if (instance == null) {                             //4：第一次检查
            synchronized (SafeDoubleCheckedLocking.class) {     //5：加锁
                if (instance == null) {                     //6：第二次检查
                    instance = new SafeDoubleCheckedLocking();  //7：问题的根源出在这里
                }                                           //8
            }                                               //9
        }                                                   //10
        return instance;                                    //11
    }
}
