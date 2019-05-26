package chapter4;

/**
 * 运行控制台无任何输出，Java虚拟机中没有非Daemon线程时会退出，所有Daemon线程会立即终止，
 * finally块并没有执行，所以构建Daemon线程时不能依靠finally块中的内容来确保执行关闭或清理资源的逻辑。
 */
public class Daemon {

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }

    static class DaemonRunner implements Runnable {

        @Override
        public void run() {
            try {
                SleepUtils.second(10);
            } finally {
                System.out.println("DaemonThread finally run.");
            }
        }
    }
}
