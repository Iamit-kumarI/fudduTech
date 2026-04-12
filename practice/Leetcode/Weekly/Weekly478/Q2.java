package Leetcode.Weekly.Weekly478;

import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(maxDistinct("abab"));
    }
    public static int maxDistinct(String s) {
        Set<Character> dist=new HashSet<>();
        for(char ch:s.toCharArray())dist.add(ch);
        return dist.size();
    }
}
