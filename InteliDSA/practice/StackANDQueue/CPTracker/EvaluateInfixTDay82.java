package StackANDQueue.CPTracker;

import java.util.Stack;

public class EvaluateInfixTDay82 {
    public static void main(String[] args) {
        String []str={"100", "+", "200", "/", "2", "*", "5", "+", "7"};
        System.out.println(evaluateInfix(str));
    }
    public static int evaluateInfix(String[] arr) {
        //can't make it
        Stack<String>stack=new Stack<>();
        int ans=0;
        for(String s:arr){
            if(s.matches("\\d+"))ans+=Integer.parseInt(s);
            else return 0;
        }
        return 0;
    }
}
