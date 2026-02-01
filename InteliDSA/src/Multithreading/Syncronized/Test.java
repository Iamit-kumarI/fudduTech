package Multithreading.Syncronized;

public class Test {
    public static void main(String[] args) {
        Counter counter=new Counter();
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println("Exception "+e);
        }
        System.out.println(counter.getCount());//printing less then 2000 becaouse our resourses
        //accseding it via same object thats why to preven this use syncronization
    }
}
