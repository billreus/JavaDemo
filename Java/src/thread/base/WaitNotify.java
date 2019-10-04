package thread.base;

/**
 * 通过wait()和notify()实现线程通信
 */
public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        WaitNotify p = new WaitNotify();
        Thread t1 = new Thread(p::PrintOdd);
        Thread t2 = new Thread(p::PrintEven);
        t1.start();
        t2.start();

        //t1.interrupt();
    }
    private synchronized void PrintOdd() {
        for(int i = 1; i < 100; i+=2){
            System.out.println(i);
            this.notify();
            try{
                this.wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    private synchronized void PrintEven() {
        for(int i = 2; i <= 100; i+=2){
            System.out.println(i);
            this.notify();
            try{
                this.wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
