package Leetcode.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class BinaryCodesOfSizeKLtc1461 {
    public static void main(String[] args) {
        System.out.println(hasAllCodes("00110110",2));
    }
    public static boolean hasAllCodes(String s, int k) {
        //generete all code of length k
        // call method to check substring
        StringBuilder sb=new StringBuilder();
        sb.append("1".repeat(Math.max(0, k)));

        int count=0;
        List<String> list=new ArrayList<>();
        while(list.size()!=k*k){
            if(!list.isEmpty() &&list.getLast().length()==k){
                if(list.getLast().contains(sb.toString()))break;
            }
//            if(list.contains(sb.toString()))break;
            list.add(Integer.toBinaryString(count++));
        }
        System.out.println(list);
        return checkSubstring(s,list,list.size()-1);
    }
    public static boolean checkSubstring(String s,List<String>list,int index){
        if(s.isEmpty())return true;
        if(list.isEmpty())return true;
        String curStr=list.get(index);
        StringBuilder sb=new StringBuilder(s);
        while(!sb.isEmpty()){
            if(sb.toString().startsWith(curStr)){
                return checkSubstring(s,list,index-1);
            }
            sb.deleteCharAt(0);
        }
        return false;
    }
}
