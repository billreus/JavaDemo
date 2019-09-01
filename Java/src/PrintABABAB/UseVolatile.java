package PrintABABAB;

public class UseVolatile {

    static volatile int num = 0;
    static volatile boolean flag = false;

    public static void main(String[] args){

        Thread t1 = new Thread(()->{
           for(;10>num;){
               if(!flag && (num==0 || ++num%2==0)){
                   try {
                       Thread.sleep(100);
                   }catch (InterruptedException e){

                   }
                   System.out.println('a');
                   flag=true;
               }
           }
        });

        Thread t2 = new Thread(()->{
            for(;10>num;){
                if(flag && (++num%2!=0)){
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
