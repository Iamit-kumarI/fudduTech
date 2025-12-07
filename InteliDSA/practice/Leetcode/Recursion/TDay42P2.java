package Leetcode.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TDay42P2 {
    public static void main(String[] args) {
        System.out.println((findPermutation("ABC")));
    }
    public static ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String>list=new ArrayList<>();
        if(s.length()==0)return list;
        helper("",s,list);
        return list;
    }
    public static void helper(String prefix,String remaning,ArrayList<String>list){
        if(remaning.length()==0){
            list.add(prefix);
            return;
        }
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<remaning.length();i++){
            char ch=remaning.charAt(i);
            if(set.contains(ch))continue;
            set.add(ch);
            String newPrefix=prefix+ch;
            String left=remaning.substring(0,i)+remaning.substring((i+1));
            helper(newPrefix,left,list);
        }
    }
}
