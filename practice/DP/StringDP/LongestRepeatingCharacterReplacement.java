package DP.StringDP;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingCharacterReplacement {
    public static int max;
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA",1));
    }
    public static int characterReplacement(String s, int k) {
        if(k==0){
            checkLongsetSubstring(s);
            return max;
        }
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray())set.add(c);
        char[]chars=new char[set.size()];
        int i=0;
        for(char c:set)chars[i++]=c;
        helper(new StringBuilder(s),k,chars,s.length()-1);
        return max+1;
    }
    public static void checkLongsetSubstring(String s){
        max=0;
        int cur=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))cur++;
            else{
                cur=0;
            }
            max=Math.max(max,cur);
        }
    }
    public static void helper(StringBuilder sb,int k,char[]chars,int index){
        if(k==0||index==-1)return;
        checkLongsetSubstring(sb.toString());
        for(char c:chars){
            if(sb.charAt(index)!=c){
                sb.setCharAt(index,c);
                helper(sb,k-1,chars,index-1);
            }else helper(sb,k,chars,index-1);
        }
    }
}
