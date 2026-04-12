package StackANDQueue.CPTracker;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s="2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s) {
        Stack<Integer>intStack=new Stack<>();
        Stack<StringBuilder>stringStack=new Stack<>();
        StringBuilder current=new StringBuilder();
        int k=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }else if(c=='['){
                intStack.push(k);
                stringStack.push(current);
                current=new StringBuilder();
                k=0;
            }else if(c==']'){
                int n=intStack.pop();
                StringBuilder prev=stringStack.pop();
                for(int i=0;i<n;i++){
                    prev.append(current);
                }
                current=prev;
            }else current.append(c);
        }
        return current.toString();
    }
}
