package thread.printABABAB.print100;

public class SynFun {
    private int j = 0;
    public synchronized void printO() {
        for(int i = 0; i < 50; i++){
            System.out.println(j);
            j ++;
            this.notify();
            try{
                this.wait();
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
