package thread.printABABAB.print100;

public class SynRunableFun implements Runnable {
    int j = 1;
    @Override
    public void run() {
        synchronized (this){
            for(int i = 0; i < 50; i++){
                System.out.println(j++);
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
}
