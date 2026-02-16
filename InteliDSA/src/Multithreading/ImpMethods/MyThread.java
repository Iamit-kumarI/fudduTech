package Multithreading.ImpMethods;

public class MyThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+" is Running ");
        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread(); //giving thread name by its constructor
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main done");
    }
}
/* here is the explanation
        once we set current thread deamon it kills it self how once it created t1  and set deamon
        done now it will start so as it will start it will go to the @Override run() and done some
        work in parallel same time it print main done now it comes to know nothing  left in main to
        do and i am set to deamon so it will destroy it self Means main thread: so it check all the work
        is done now it won't wait for others to finish or do background task it will terminate if no thread
        left in main(current thread)
 */