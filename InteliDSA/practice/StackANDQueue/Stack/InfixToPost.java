package StackANDQueue.Stack;

import java.util.Stack;

public class InfixToPost {
    public static void main(String[] args) {
        String str="a*(b+c)/d";
        System.out.println(infixToPostfix(str));
    }
    public static String infixToPostfix(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isAlphabetic(c))sb.append(c);
            else if(c=='(')stack.push(c);
            else if(c==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while (!stack.isEmpty()&&stack.peek()!='('&&
                        (checkPrecedency(stack.peek())>checkPrecedency(c)||
                                (checkPrecedency(stack.peek())==checkPrecedency(c)&&c!='^'))){
                        sb.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static int  checkPrecedency(char c){
        if(c=='+'||c=='-')return 1;
        if(c=='*'||c=='/')return 2;
        if(c=='^')return 3;
        return 0;
    }
}
