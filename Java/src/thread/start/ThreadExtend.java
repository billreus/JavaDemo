package thread.start;

/**
 * 开启线程方法一
 * 继承Thread类
 */
public class ThreadExtend extends Thread{
    public static void main(String[] args){
        Thread t1 = new ThreadExtend1();
        Thread t2 = new ThreadExtend2();
        t1.start();
        t2.start();
    }
}
class ThreadExtend1 extends Thread{
    @Override
    public void run() {
        System.out.print("a");
    }
}
class ThreadExtend2 extends Thread{
    @Override
    public void run() {
        System.out.print("b");
    }
}

