package Multithreading.Syncronized;

public class Counter {
    private int count=0;
    public synchronized void increment(){
//        synchronized (this){ //we can apply this only on one part as well rather than all method
//            count++;
//        }
        count++;
    }
    public int getCount(){
        return count;
    }
}
