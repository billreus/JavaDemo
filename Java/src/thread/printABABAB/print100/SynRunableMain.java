package thread.printABABAB.print100;

/**
 * SynRunableFun中已经实现了线程接口
 */
public class SynRunableMain {
    public static void main(String[] args){
        SynRunableFun p1 = new SynRunableFun();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p1);
        t1.start();
        t2.start();
    }
}
