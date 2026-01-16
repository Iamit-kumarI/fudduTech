package StackANDQueue.CPTracker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RevStackUsingRecursion {
    public static Queue<Integer>queue=new LinkedList<>();
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        for(int i=1;i<5;i++)stack.push(i);
        reverseStack(stack);
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        Stack<Integer>ans=new Stack<>();
        helper(ans,st);
        System.out.println(st);
        helper(st,ans);
        System.out.println(st);
//        removeRecursion(st);
//        constructRecursion(st);
//    }
//    public static void removeRecursion(Stack<Integer>st){
//        if(st.isEmpty())return;
//        queue.offer(st.pop());
//        removeRecursion(st);
//    }
//    public static void constructRecursion(Stack<Integer>st){
//        if(queue.isEmpty())return;
//        st.push(queue.poll());
//        constructRecursion(st);
    }
    public static void helper(Stack<Integer>ans,Stack<Integer>st){
        if(st.isEmpty())return;
        ans.push(st.pop());
        helper(ans,st);
    }
}
