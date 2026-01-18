package StackANDQueue.CPTracker;

import java.util.Stack;

public class CustomStack {
    int[]arr;
    int top=0;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }

    public void push(int x) {
        if(top<arr.length)arr[top++]=x;
    }

    public int pop() {
        if(top==0)return -1;
        return arr[--top];
    }

    public void increment(int k, int val) {
        int min=Math.min(k,top);
        for(int i=0;i<min;i++)arr[i]+=val;
    }
}