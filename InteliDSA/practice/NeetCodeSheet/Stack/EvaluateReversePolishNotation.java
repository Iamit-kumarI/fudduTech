package NeetCodeSheet.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[]str={"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(str));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(calculate(b,a,s));
            }else stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
    public static int calculate(int a,int b,String symbole){
        switch (symbole){
            case "+":
                return a+b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:
                return a-b;
        }
    }
}