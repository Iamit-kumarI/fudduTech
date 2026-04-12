package StackANDQueue.CPTracker;

import java.util.Stack;

public class MinAddToMakeValidLtc921 {
    public static void main(String[] args) {
        String str="(((";
        System.out.println(minAddToMakeValid(str));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')'){
                if(stack.isEmpty()&&stack.peek()=='(')stack.pop();
                else stack.push(c);
            }else stack.push(c);
        }
        return stack.size();
    }
}
