package Leetcode.Randome.Old;

import java.util.*;

public class TDay27 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }

    public static String removeDuplicateLetters(String s) {
        int []charArr=new int[26];
        boolean[]found=new boolean[26];
        for(int i=0;i<s.length();i++)charArr[s.charAt(i)-'a']=i;
        Deque<Character>queue=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(found[s.charAt(i)-'a'])continue;
            while(!queue.isEmpty()&&queue.peekLast()>s.charAt(i)&&charArr[queue.peekLast()-'a']>i){
                found[queue.removeLast()-'a']=false;
            }
            queue.add(s.charAt(i));
            found[s.charAt(i)-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:queue)sb.append(c);
        return sb.toString();
    }
}
//lexographicorder should be maintained
//    public static String removeDuplicateLetters(String s) {
//        char []charArr=new char[26];
////        Arrays.fill(charArr,' ');
//        for(char c:s.toCharArray()){
//            if(charArr[c-'a']=='\u0000')charArr[c-'a']=c;
//        }
//        StringBuilder sb=new StringBuilder();
//        for(char c:charArr)if(c!='\u0000')sb.append(c);
//        return sb.toString();
//    }
//    public static String helper(String s){
//        Set<Character> set=new HashSet<>();
//        StringBuilder sb=new StringBuilder();
//        for(char c:s.toCharArray())if(!set.contains(c)){
//            set.add(c);
//            sb.append(c);
//        }
//        return sb.toString();
//    }
//}
