package Leetcode.String;

import java.util.HashSet;
import java.util.Set;

public class NoOfSpecialCharacers {
    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("aaAbcBC"));
    }
    public static int numberOfSpecialChars(String word) {
        int[]lower=new int[26];
        int[]upper=new int[26];
        int ans=0;
        for(char c:word.toCharArray()){
            if(c>='a'&&c<='z')lower[c-'a']++;
            else upper[c-'A']++;
        }
        for(int i=0;i<26;i++){
            if(lower[i]!=0&&upper[i]!=0)ans++;
        }
        return ans;
    }
}
