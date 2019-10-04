package thread.printABABAB;

public class UseVolatile {

    static int num = 0;
    static volatile boolean flag = true;

    public static void main(String[] args){
        Thread t1 = new Thread(()->{
           for(;10>num;){
               if(flag && (num==0 || ++num%2==0)){
                   try {
                       Thread.sleep(100);
                   }catch (InterruptedException e){

                   }
                   System.out.println('a');
                   flag = false;
               }
           }
        });

        Thread t2 = new Thread(()->{
            for(;10>num;){
                if(!flag && (++num%2!=0)){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){

                    }
                    System.out.println('b');
                    flag = true;
                }
            }
        });
        t1.start();
        t2.start();
    }
}
