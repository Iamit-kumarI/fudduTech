package NeetCodeSheet.Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str="()[]{}";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='('||c=='[')stack.push(c);
            else if(stack.isEmpty())return false;
            else if(c=='}'){
                if(stack.pop()!='{')return false;
            }else if(c==')'){
                if(stack.pop()!='(')return false;
            }else if(c==']'){
                if(stack.pop()!='[')return false;
            }
        }
        return stack.isEmpty();
    }
}
