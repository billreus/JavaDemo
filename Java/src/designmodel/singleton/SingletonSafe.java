package designmodel.singleton;

public class SingletonSafe {

    /*
     * volatile是因为防止new对象的重排序
     * 1.为 uniqueInstance 分配内存空间
     * 2.初始化 uniqueInstance
     * 3.将 uniqueInstance 指向分配的内存地址
     * 不重排序可能1-3-2导致出现问题
     * 如：线程 T1 执行了 1 和 3，此时 T2 调用 getUniqueInstance() 后发现 uniqueInstance 不为空，
     * 因此返回 uniqueInstance，但此时 uniqueInstance 还未被初始化。
     * */

    private volatile static SingletonSafe uniqueInstanceSafe;

    private SingletonSafe(){}

    public static SingletonSafe getUniqueInstanceSafe(){
        if(uniqueInstanceSafe == null){
            synchronized (SingletonSafe.class){
                if(uniqueInstanceSafe == null){
                    uniqueInstanceSafe = new SingletonSafe();
                }
            }
        }
        return uniqueInstanceSafe;
    }
}
