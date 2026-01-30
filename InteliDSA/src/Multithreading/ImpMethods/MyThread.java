package Multithreading.ImpMethods;

public class MyThread extends Thread{

    MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<=500009;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority()+" Count "+i);
        }
    }

    public static void main(String[] args) {
//        MyThread t1=new MyThread("vipul"); //giving thread name by its constructor
        MyThread low=new MyThread("Low Priority Thread");
        MyThread med=new MyThread("Medium Priority Thread");
        MyThread heigh=new MyThread("High Priority Thread");
        low.setPriority(Thread.MIN_PRIORITY);
        med.setPriority(Thread.NORM_PRIORITY);
        heigh.setPriority(Thread.MAX_PRIORITY);
        low.start();
        med.start();
        heigh.start();
    }
}
