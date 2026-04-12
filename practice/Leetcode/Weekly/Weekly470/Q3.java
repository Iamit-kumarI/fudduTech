package Leetcode.Weekly.Weekly470;

import java.util.Stack;

public class Q3 {
    public String removeSubstring(String s, int k) {
        // same like valid parenthesis
        String ans="";
        int count=0;
        Stack<Character> stack=new Stack<>();
        while(k>0){
            for(char c:s.toCharArray()){
                if(c=='('){
                    stack.push(c);
                    count++;
                    k--;
                }
                if(c==')'){
                    stack.pop();
                    count++;
                    k--;
                }
            }
        }
        return " ";
    }
}
