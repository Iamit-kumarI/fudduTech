package StackANDQueue.Queue;
import java.util.Stack;

public class ImplementeQueueByStack {
    //Leetcode 232
    private Stack<Integer> first;
    private Stack<Integer> second;
    public ImplementeQueueByStack(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }
    public int remove() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());//move from first to second
        }
        int removed=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    public int peek()throws Exception{
        //just looking at the item not removing
        while(!first.isEmpty()){
            second.push(first.pop());//move from first to second
        }
        int removed=second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
}
