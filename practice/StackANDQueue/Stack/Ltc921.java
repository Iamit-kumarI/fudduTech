package StackANDQueue.Stack;

import java.util.Stack;

public class Ltc921 {
    public int minAddToMakeValid(String s) {
        Stack<Character> stak=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!stak.isEmpty()&&stak.peek()==')'){
                    stak.pop();
                }else{
                    stak.push(ch);
                }
            }else{
                stak.push(ch);
            }
        }
        return stak.size();
    }
}
