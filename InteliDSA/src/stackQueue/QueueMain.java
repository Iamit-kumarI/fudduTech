package stackQueue;

public class QueueMain {
    public static void main(String[] args)throws Exception {
        /*
        CustomQueue queue=new CustomQueue(6);
        queue.insert(10);
        queue.insert(12);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        System.out.println(queue.remove());// is removed from 0 so now 12 from 1 ll be at 0
        System.out.println(queue.front());//12 is at 0 now
        queue.display();
         */
        /*
        CircularQueue queue=new CircularQueue(6);
        queue.insert(10);
        queue.insert(12);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        queue.remove();
        queue.insert(8);
        System.out.println(queue.remove());
        queue.display();
         */
        DynamicCircularQueue queue=new DynamicCircularQueue(5);
        //chaecking dynamic queue
        queue.insert(10);
        queue.insert(12);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        //added five element so now size==len so isfull is true
        //now size will be double size*2 if we insert again
        queue.display();
        queue.insert(8);
        queue.display();
    }
}
