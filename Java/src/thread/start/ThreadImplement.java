package thread.start;

/**
 * 开启线程方法二
 * 实现Runnable接口
 */
public class ThreadImplement {
    public static void main(String[] args){
        Thread1 r1 = new Thread1();
        Thread t1 = new Thread(r1);
        t1.start();

        Thread2 r2 = new Thread2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.print("a");
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.print("b");
    }
}
