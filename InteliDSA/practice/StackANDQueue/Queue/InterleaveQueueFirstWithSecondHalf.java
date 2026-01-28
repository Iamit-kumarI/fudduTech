package StackANDQueue.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueueFirstWithSecondHalf {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
//        queue.offer(2);
//        queue.offer(4);
        queue.offer(3);
        queue.offer(5);
        rearrangeQueue(queue);
    }
    public static void rearrangeQueue(Queue<Integer> q) {
        Queue<Integer>firstHalf=new LinkedList<>();
        Queue<Integer>secondHalf=new LinkedList<>();
        int n=q.size()/2;
        while(n-->0)firstHalf.offer(q.poll());
        while (!q.isEmpty())secondHalf.offer(q.poll());
        while(!firstHalf.isEmpty()&&!secondHalf.isEmpty()){
            q.offer(firstHalf.poll());
            q.offer(secondHalf.poll());
        }
        System.out.println(q);
    }
}
