package Multithreading.ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Intro {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ExecutorService executor= Executors.newFixedThreadPool(3);
        for(int i=1;i<10;i++){
            int finalL=i;
            executor.submit(()->{
                System.out.println(factorial(finalL));
            });
        }
        executor.shutdown();
        System.out.println("Time  : "+(System.currentTimeMillis()-startTime));
    }
    public static int factorial(int n) {
        int result=1;
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=n;i>1;i--){
            result*=i;
        }
        return result;
    }
}
