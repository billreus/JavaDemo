package thread.volatileDemo;

/**
 * volatile无法保证原子性
 * 多线程操作一个变量的时候需要使用一个标签进行判断
 */
public class VolatileAtomic {

    static int num  = 0;
    static volatile boolean flag = false;

    public static void main(String[] args){
        Thread t1 = new Thread(() ->{
           while (num < 50){
               if(!flag && ++num % 2 == 0){
                   try {
                        Thread.sleep(100);
                   } catch (InterruptedException e) {
                        e.printStackTrace();
                   }
                   System.out.println(num);
                   flag = true;
               }
           }
        });

        Thread t2 = new Thread(() ->{
            while (num < 50){
                if(flag && ++num % 2 != 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(num);
                    flag = false;
                }
            }
        });

        t1.start();
        t2.start();
    }
}
