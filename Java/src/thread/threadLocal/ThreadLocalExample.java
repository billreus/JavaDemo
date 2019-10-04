package thread.threadLocal;

/**
 * 每个线程都有自己的本地内存
 */
public class ThreadLocalExample {

    public static void main(String[] args){
        ThreadLocal threadLocal = new ThreadLocal();
        Thread thread1 = new Thread(() ->{
            threadLocal.set(1);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("thread1: "+threadLocal.get());
            threadLocal.remove();
        });
        Thread thread2 = new Thread(() ->{
            System.out.println("thread2: "+threadLocal.get());
            threadLocal.set(2);
            //threadLocal.remove();
            System.out.println("thread2: "+threadLocal.get());
        });
        thread1.start();
        thread2.start();
    }
}
