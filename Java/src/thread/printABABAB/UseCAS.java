package thread.printABABAB;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS虽然是线程安全的，但是此方法中如果在打印a之前，
 * 线程b进入+1依然是符合条件的，所以轮流打印只能把CAS上锁
 * 或者当作flag使用
 */
public class UseCAS {
    static AtomicInteger cxsNum = new AtomicInteger(0);
    public static void main(String[] args){
        Thread t1 = new Thread(() ->{
            for(;10>cxsNum.get();){
                if((cxsNum.get() == 0 || cxsNum.incrementAndGet()%2 == 0)){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){

                    }

                    System.out.println('a');

                }
            }
        });

        Thread t2 = new Thread(() ->{
            for(;10>cxsNum.get();){
                if(( cxsNum.incrementAndGet()%2 != 0)){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){

                    }
                    System.out.println('b');

                }
            }
        });

        t1.start();
        t2.start();
    }
}
