package StackANDQueue.Stack;

import java.util.Arrays;
import java.util.Stack;

public class PostFixOperations {
    public static void main(String[] args) {
        String []arr={"2","1","+","3","*"};
        System.out.println(evalRPN(arr));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(calculate(b,a,s));
            }else stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
    public static int calculate(int a,int b,String op){
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                return a / b;
        }
    }
}
