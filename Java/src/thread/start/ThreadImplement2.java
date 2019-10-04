package thread.start;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 开启线程方法三
 * 实现Callable接口
 */
public class ThreadImplement2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCall1 c1 = new ThreadCall1();
        FutureTask<Integer> ft1 = new FutureTask<>(c1);
        Thread t1 = new Thread(ft1);
        t1.start();
        System.out.println(ft1.get());

        ThreadCall2 c2 = new ThreadCall2();
        FutureTask<Integer> ft2 = new FutureTask<>(c2);
        Thread t2 = new Thread(ft2);
        t2.start();
        System.out.println(ft2.get());
    }
}
class ThreadCall1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 123;
    }

}
class ThreadCall2 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 456;
    }
}