package Multithreading.DeadLock;

import javax.swing.plaf.TableHeaderUI;

//public class DeadLock {
    class Pen{
        public synchronized void writeWithPenAndPaper(Paper paper){
            System.out.println(Thread.currentThread().getName()+" is using pen "+this+" and trying to user Paper"+paper);
            paper.finishWriting();
        }
        public synchronized void finishWriting(){
            System.out.println(Thread.currentThread().getName()+" finished using this pen "+this);
        }
    }
    class Paper{
        public synchronized void writeWithPaperAndPen(Pen pen){
            System.out.println(Thread.currentThread().getName()+" is using pen "+this+" and trying to user Paper"+pen);
            pen.finishWriting();
        }
        public synchronized void finishWriting(){
            System.out.println(Thread.currentThread().getName()+" finished using this pen "+this);
        }
    }
    class Task1 implements Runnable{
        private Pen pen;
        private Paper paper;
        public Task1(Pen pen,Paper paper){
            this.pen=pen;
            this.paper=paper;
        }

        @Override
        public void run() {
            pen.writeWithPenAndPaper(paper);
        }
    }
    class Task2 implements Runnable{
        private Pen pen;
        private Paper paper;
        public Task2(Pen pen,Paper paper){
            this.pen=pen;
            this.paper=paper;
        }
        @Override
        public void run() {
            paper.writeWithPaperAndPen(pen);
        }
    }
    public class DeadLock{
        public static void main(String[] args) {
            Pen pen=new Pen();
            Paper paper=new Paper();

            Thread thread1=new Thread(new Task1(pen,paper),"Thread 1");
            Thread thread2=new Thread(new Task2(pen,paper),"Thead 2");

            thread1.start();
            thread2.start();
        }
    }
//}
