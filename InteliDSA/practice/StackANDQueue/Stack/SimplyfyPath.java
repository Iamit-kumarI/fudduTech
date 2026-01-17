package StackANDQueue.Stack;

import java.util.Stack;
import java.util.stream.Collectors;

public class SimplyfyPath {
    public static void main(String[] args) {
        String str="/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(str));
    }
    public static String simplifyPath(String path) {
        StringBuilder sb=new StringBuilder();
        Stack<String >stack=new Stack<>();
        String[]arr=path.split("/");
        for(String cur:arr){
            if(cur.equals(".")||cur.isEmpty())continue;
            else if(cur.equals("..")){
                if(!stack.isEmpty())stack.pop();
            }else stack.push(cur);
        }
        if(stack.isEmpty())return "/";
        return stack.stream().map(x->'/'+x).collect(Collectors.joining());
    }
}
