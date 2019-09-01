public class printNum {
    public static void main(String args[]){
        final printNum  Num= new printNum();
        Thread t1 = new Thread(Num::printJ);
        Thread t2 = new Thread(Num::printO);
        t1.start();
        t2.start();
    }
    public synchronized void printJ(){
        for(int i=1; i<100; i+=2){
            System.out.println(i);
            this.notify();
            try{
                this.wait();
            }catch (InterruptedException e){

            }
        }
    }
    public synchronized void printO(){
        for(int i=2; i<=100; i+=2){
            System.out.println(i);
            this.notify();
            try{
                this.wait();
            }catch (InterruptedException e){

            }
        }
    }

}
