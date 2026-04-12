package Leetcode.Weekly.Weekly484;

import java.util.HashMap;

public class Q3 {
    public long countPairs(String[] words) {
        //not running for all cases
        HashMap<String,Integer> map=new HashMap<>();
        for(String curStr:words){
            String word=helper(curStr);
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int count=0;
        for(int freq:map.values())if(freq>1)count+=freq*(freq-1)/2;
        return count;
    }
    public static String helper(String str){
        int shift=str.charAt(0)-'a';
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
//            int cur=(str.charAt(i)-'a')-shift+26)%26;
            int cur=0;
            sb.append(cur).append(',');
        }
        return sb.toString();
    }
}