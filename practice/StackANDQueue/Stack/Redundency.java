package StackANDQueue.Stack;

import java.util.Stack;

public class Redundency {
    public static void main(String[] args) {
        String str="(a+(b+(c+d)))";
        System.out.println(checkRedundancy(str));
    }
    public static boolean checkRedundancy(String s) {
        Stack<StringBuilder> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(new StringBuilder("("));
            }
            else if(s.charAt(i)==')'){
                st.peek().append(")");
                StringBuilder sb = st.peek();st.pop();
                if(sb.length()>3){
                    if(st.empty()){
                        st.push(new StringBuilder("a"));
                    }
                    else st.peek().append("a");
                }
                else{
                    return true;
                }
            }
            else{
                if(st.empty())st.push(new StringBuilder());
                st.peek().append(s.charAt(i));
            }
        }
        return false;//git network error
    }
}
