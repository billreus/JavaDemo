import java.util.concurrent.atomic.AtomicInteger;

public class d {

   static volatile int i = 0;

        public static void main(String args[]){

            Thread t1 = new Thread(()->{
                for(;100>=i;){
                    if((i==0 || i%2==0)){
                        System.out.println(i);
                        i++;
                    }
                }
            });

            Thread t2 = new Thread(()->{
                for(;100>i;){
                    if((i%2!=0)){
                        System.out.println(i);
                        i++;
                    }
                }
            });
            t1.start();
            t2.start();
        }

    }
