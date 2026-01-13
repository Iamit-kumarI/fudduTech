package StackANDQueue.Stack;

import java.util.Comparator;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.sort((a,b)->a-b);
    }
}
