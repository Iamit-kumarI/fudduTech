package StackANDQueue.Stack;

import java.util.*;
import java.util.stream.Collectors;

public class Ltc1047 {
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty()&&stack.peek()==c)stack.pop();
            else stack.push(c);
        }
        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
