package thread.printABABAB.print100;

public class VolatileFunMain {
    private static volatile boolean flag = true;
    private static int j = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for(;j<100;){
                if (flag && j % 2 == 0) {
                    System.out.println(j);
                    j++;
                    flag = false;
                }
            }

        });

        Thread t2 = new Thread(() -> {
            for(;j < 100;){
                if (!flag && j % 2 != 0) {
                    System.out.println(j);
                    j++;
                    flag = true;
                }
            }

        });

        t1.start();
        t2.start();
    }
}
