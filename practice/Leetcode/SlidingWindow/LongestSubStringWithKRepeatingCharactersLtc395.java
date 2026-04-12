package Leetcode.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKRepeatingCharactersLtc395 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("ababbc",2));
    }
    public static int longestSubstring(String s, int k) {
        if(s.isEmpty()||s.length()<k)return 0;
        int[]freq=new int[26];
        for(char c:s.toCharArray())freq[c-'a']++;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']<k){
                int left=longestSubstring(s.substring(0,i),k);
                int right=longestSubstring(s.substring(i,s.length()),k);
                return Math.max(left,right);
            }
        }
        return s.length();
    }
}
