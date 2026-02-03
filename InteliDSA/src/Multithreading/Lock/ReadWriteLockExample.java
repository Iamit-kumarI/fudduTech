package Multithreading.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private int count=0;
    private final ReadWriteLock lock=new ReentrantReadWriteLock();
    private final Lock readLock=lock.readLock();// creating seprate lock for reading
    private final Lock writeLock=lock.writeLock();//seperate lock for writing only
    //readd write lock can comunicate eact other and read won't happen if any thread had acquired
    // write lock once that finished then write lock can happen

}
