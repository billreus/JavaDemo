package thread.printABABAB;

public class UseSyn {
    public static void main(String[] args){
        final UseSyn useSyn = new UseSyn();
        Thread t1 = new Thread(()->useSyn.printA());
        Thread t2 = new Thread(useSyn::printB);
        t1.start();
        t2.start();
    }

    public synchronized void printA(){
        for(int i=1; i<=10; i+=1){
            System.out.println('b');
            this.notify();
            try {
                this.wait();
                Thread.sleep(100);
            }catch (InterruptedException e){

            }
        }
    }

    public synchronized void printB(){
        for(int i=1; i<=10; i+=1){
            System.out.println('a');
            this.notify();
            try {
                this.wait();
                Thread.sleep(100);
            }catch (InterruptedException e){

            }
        }
    }
}
