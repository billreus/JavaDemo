package thread.printABABAB.print100;

/**
 * 在main函数中创建线程
 * 调用SynFun中的同步锁方法
 */
public class SynMain {
    public static void main(String[] args){
        SynFun p2 = new SynFun();

        Thread t1 = new Thread(()->{
            p2.printO();
        });
        Thread t2 = new Thread(p2::printO);
        t1.start();
        t2.start();
    }
}
