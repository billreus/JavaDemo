import java.util.concurrent.atomic.AtomicInteger;

public class printNum {
    static volatile boolean flag = false;
    static AtomicInteger i = new AtomicInteger(0);

    public static void main(String args[]){
        //final printNum Num= new printNum();
        Thread t1 = new Thread(()->{
            for(;100>=i.get();){
                if(!flag && (i.get()==0 || i.get()%2==0)){
                    System.out.println(i);
                    flag=true;
                    i.incrementAndGet();
                }
            }
        });

        Thread t2 = new Thread(()->{
            for(;100>i.get();){
                if(flag && (i.get()%2!=0)){
                    System.out.println(i);
                    flag=false;
                    i.incrementAndGet();
                }
            }
        });
        t1.start();
        t2.start();
    }

}
