package Leetcode.Biweekly.BW177;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(mergeCharacters("yybyzybz",2));
    }
    public static String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int[]sufix=new int[26];
        Arrays.fill(sufix,-1);
        for(char c:s.toCharArray()){
            int curIndex=c-'a';
            if(sufix[curIndex]!=-1&&sb.length()-sufix[curIndex]<=k){
                continue;
            }
            sufix[curIndex]=sb.length();
            sb.append(c);
        }
        return sb.toString();
    }
}
