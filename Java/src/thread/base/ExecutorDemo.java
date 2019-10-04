package thread.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executor线程池
 */
public class ExecutorDemo {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            int finalI = i;
            executorService.execute(() -> System.out.println(finalI));
        }
        executorService.shutdown();
    }
}
