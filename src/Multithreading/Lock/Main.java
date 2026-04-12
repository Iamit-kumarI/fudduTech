package Multithreading.Lock;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi=new BankAccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
                sbi.withdrawl(50);
            }
        };
        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thead 2");
        t1.start();
        t2.start();

    }
}
