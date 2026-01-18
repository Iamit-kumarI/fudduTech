package StackANDQueue.CPTracker;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//stack using queue
public class MyStack {
    Deque<Integer>queue;
    public MyStack() {
        queue=new ArrayDeque<>();
    }

    public void push(int x) {
        queue.addFirst(x);
    }

    public int pop() {
        return queue.removeFirst();
    }

    public int top() {
        if(!queue.isEmpty())return queue.peekFirst();
        return -1;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
