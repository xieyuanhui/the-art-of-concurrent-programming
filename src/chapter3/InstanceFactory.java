package chapter3;

/**
 * 基于类初始化的解决方案
 */
public class InstanceFactory {

    private static class InstanceHolder {
        public static InstanceFactory instance = new InstanceFactory();
    }

    public static InstanceFactory getInstance() {
        return InstanceHolder.instance;   //这里将导致InstanceHolder类被初始化
    }
}
