package Leetcode.Recursion.SubSeq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TDay43LexographicOrder {
    public static void main(String[] args) {
        System.out.println(AllPossibleStrings("abc"));
    }
    public static List<String> AllPossibleStrings(String s) {
        // Code here
        List<String>list=new ArrayList<>();
        helper(0,s,list,new StringBuilder());
        Collections.sort(list);
        return list;
    }
    public static void helper(int index,String s,List<String >list,StringBuilder sb){
        if(index==s.length()){
            if(sb.length()>0)list.add(sb.toString());
            return;
        }
        sb.append(s.charAt(index));
        //take it
        helper(index+1,s,list,sb);
        sb.deleteCharAt(sb.length()-1);
        //ignore it
        helper(index+1,s,list,sb);
    }

}
