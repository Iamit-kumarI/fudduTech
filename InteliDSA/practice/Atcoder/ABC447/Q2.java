package Atcoder.ABC447;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=0;
        HashMap<Character,Integer>map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            max=Math.max(max,map.get(c));
        }
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(map.get(c)!=max)sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
