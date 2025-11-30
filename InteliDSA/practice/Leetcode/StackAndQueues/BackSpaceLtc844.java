package Leetcode.StackAndQueues;

import java.util.Stack;

public class BackSpaceLtc844 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }
    public static boolean backspaceCompare(String s, String t) {
        String str1=remove(s);
        String str2=remove(t);
        return str1.equals(str2);
    }
    public static String remove(String s){
        Stack<Character> stack=new Stack<>();
        int index=0;
        for(char c:s.toCharArray()){
            if(index!=0&&c=='#'){
                stack.pop();
                index--;
                continue;
            }
            if(c=='#'){
                continue;
            }
            index++;
            stack.push(c);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
