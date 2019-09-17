package PrintABABAB;

public class UseVolatile {

    static volatile int num = 0;

    public static void main(String[] args){
        Thread t1 = new Thread(()->{
           for(;10>num;){
               if((num==0 || ++num%2==0)){
                   try {
                       Thread.sleep(100);
                   }catch (InterruptedException e){

                   }
                   System.out.println('a');
               }
           }
        });

        Thread t2 = new Thread(()->{
            for(;10>num;){
                if((++num%2!=0)){
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
