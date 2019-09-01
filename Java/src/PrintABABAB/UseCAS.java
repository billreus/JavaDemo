package PrintABABAB;

import java.util.concurrent.atomic.AtomicInteger;

public class UseCAS {
    static AtomicInteger cxsNum = new AtomicInteger(0);
    static volatile boolean flag = false;
    public static void main(String[] args){
        Thread t1 = new Thread(() ->{
            for(;10>cxsNum.get();){
                if(!flag && (cxsNum.get() == 0 || cxsNum.incrementAndGet()%2 == 0)){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){

                    }
                    System.out.println('a');
                    flag=true;
                }

            }
        });

        Thread t2 = new Thread(() ->{
            for(;10>cxsNum.get();){
                if(flag && ( cxsNum.incrementAndGet()%2 != 0)){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){

                    }
                    System.out.println('b');
                    flag=false;
                }

            }
        });

        t1.start();
        t2.start();
    }
}
