package Multithreading.ImpMethods;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" is Running ");
            Thread.yield();//means we are telling thread that give change to other thred
        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread(); //giving thread name by its constructor
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
        t1.interrupt();
    }
}
