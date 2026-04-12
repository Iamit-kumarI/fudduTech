package Multithreading.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;
    private final Lock lock=new ReentrantLock();

    public void withdrawl(int amount){
        System.out.println(Thread.currentThread().getName()+" Trying to withdrawl");
        try{
            if(lock.tryLock(3000, TimeUnit.MILLISECONDS)){
                //wait for lock to acquire for 10 seconds if gets withing 10 then go otherwise return false
                if(balance>=amount){
                   try{
                       System.out.println(Thread.currentThread().getName()+" Procesing with withDrawl");
                       Thread.sleep(3000);//in processing of withdrawl it takes 3 seconds operation so we stopped our
                       // someelse thread to acqire this lock so to safe withdrwal process
                       balance-=amount;
                       System.out.println(Thread.currentThread().getName()+" Completed withdrwa, Remaning amoutn is : "+balance);

                   }catch (Exception e){
//                       System.out.println("Exception in the process of withdrawl, Try Again");//not good practice
                        Thread.currentThread().interrupt();
                   }finally {
                       //it is very importent to release the lock we have acquired
                       lock.unlock();
                   }
                }else System.out.println(Thread.currentThread().getName()+" Insufficent balance");
            }else System.out.println(Thread.currentThread().getName()+" Couldn't acquire lock, Try Again");
        } catch (Exception e) {
//            System.out.println(Thread.currentThread().getName()+" Can't find lock"); //not good practice
            Thread.currentThread().interrupt();
        }
    }
}
